package com.app.androiddevelopment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.app.androiddevelopment1.databinding.ListItemBinding;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<Country>countryList;
    private Context context;
    private ListItemBinding binding;

    public CustomAdapter(Context context,List<Country> countryList) {
        this.countryList = countryList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        binding = ListItemBinding.inflate(LayoutInflater.from(context),viewGroup,false);
        binding.textView.setText(countryList.get(i).getName());
        binding.icon.setImageResource(countryList.get(i).getIcon());
        return binding.getRoot();
    }
}
