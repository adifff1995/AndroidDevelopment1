package com.app.androiddevelopment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.app.androiddevelopment1.databinding.ActivityAlertDialogBinding;
import com.app.androiddevelopment1.databinding.ActivityResultBinding;
import com.app.androiddevelopment1.databinding.CustomDialogBinding;

import java.util.ArrayList;
import java.util.List;

public class AlertDialogActivity extends AppCompatActivity {
    String tutorials[]
            = {"Algorithms", "Data Structures",
            "Languages", "Interview Corner",
            "GATE", "ISRO CS",
            "UGC NET CS", "CS Subjects",
            "Web Technologies"};

    AlertDialog dialog;
    private ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        registerForContextMenu(binding.button7);
        String[]list = getResources().getStringArray(R.array.data);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,
                R.layout.custom_text_item,list);
        binding.listview.setAdapter(adapter);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0)
                    finish();
                Toast.makeText(AlertDialogActivity.this,list[position] , Toast.LENGTH_SHORT).show();
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                showPopUpMenu(view);
//                showAlertDialog();
                showCustomAlertDialog();
            }
        });

    }

    private void showCustomAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CustomDialogBinding dialogBinding = CustomDialogBinding.inflate(getLayoutInflater());
        builder.setView(dialogBinding.getRoot());

        dialogBinding.textTitle.setText("Warning");
        dialogBinding.textMessage.setText("Are you sure you want to Exit ?!");
        dialogBinding.buttonAction.setText("OK");
        dialogBinding.buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AlertDialogActivity.this, "Done", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialogBinding.imageIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning");
        builder.setMessage("Are you sure you want to Exit ?!");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "YES", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "No", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "Later", Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    private void showPopUpMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.my_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_share:
                        Toast.makeText(AlertDialogActivity.this, "menu_share", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menu_logout:
                        finish();
                        break;

                    case R.id.menu_sitting:
                        Toast.makeText(AlertDialogActivity.this, "menu_sitting", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_share:
                Toast.makeText(this, "menu_share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_logout:
                finish();
                break;

            case R.id.menu_sitting:
                Toast.makeText(this, "menu_sitting", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}