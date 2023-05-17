package com.app.androiddevelopment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.androiddevelopment1.databinding.RvGameItemBinding;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Game> gameList;
    private ClickHandle clickHandle;
    private RvGameItemBinding binding;

    public GamesAdapter(Context context, List<Game> gameList,ClickHandle clickHandle) {
        this.context = context;
        this.gameList = gameList;
        this.clickHandle = clickHandle;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RvGameItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.binding.tvName.setText(gameList.get(position).getName());
        myViewHolder.binding.tvRate.setText(gameList.get(position).getRate());
        myViewHolder.binding.tvType.setText(gameList.get(position).getType());
        myViewHolder.binding.gameImg.setImageResource(gameList.get(position).getImage());

        myViewHolder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               clickHandle.onItemClick(position);
            }
        });
        myViewHolder.binding.tvMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              clickHandle.onMoreClick(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RvGameItemBinding binding;

        public MyViewHolder(RvGameItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


    public interface ClickHandle{
        void onItemClick(int position);
        void onMoreClick(int position);
    }
}

