package com.app.androiddevelopment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.app.androiddevelopment1.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity  {

    ActivityRecyclerViewBinding binding;
    GamesAdapter adapter;
    private List<Game>gameList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        gameList = new ArrayList<>();
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        gameList.add(new Game("game1","FREE","4",R.drawable.eg));
        adapter = new GamesAdapter(this, gameList, new GamesAdapter.ClickHandle() {
            @Override
            public void onItemClick(int position) {
              binding.tvTitle.setText(gameList.get(position).getName());
            }

            @Override
            public void onMoreClick(int position) {

            }
        });
        binding.gamesList.setAdapter(adapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.gamesList.setLayoutManager(layoutManager);

    }


}