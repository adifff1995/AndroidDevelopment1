package com.app.androiddevelopment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.app.androiddevelopment1.databinding.ActivityCustomAdapterBinding;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    ActivityCustomAdapterBinding binding;
    private List<CountryModel>countryModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAdapterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        countryModelList = new ArrayList<>();
        countryModelList.add(new CountryModel("Palestine","972",R.drawable.pal));
        countryModelList.add(new CountryModel("Egypt","972",R.drawable.eg));
        countryModelList.add(new CountryModel("Qatar","972",R.drawable.pal));
        countryModelList.add(new CountryModel("Turkey","972",R.drawable.message));
        countryModelList.add(new CountryModel("Jordan","972",R.drawable.eg));

        MyListAdapter adapter = new MyListAdapter(this,countryModelList);
        binding.listview.setAdapter(adapter);
    }
}