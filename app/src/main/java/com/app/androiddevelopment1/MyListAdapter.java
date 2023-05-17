package com.app.androiddevelopment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.app.androiddevelopment1.databinding.MyListItemBinding;

import java.util.List;

public class MyListAdapter extends BaseAdapter {
   private Context context;
   private List<CountryModel>countryModelList;
    private MyListItemBinding binding;
    public MyListAdapter(Context context, List<CountryModel> countryModelList) {
        this.context = context;
        this.countryModelList = countryModelList;
    }

    @Override
    public int getCount() {
        return countryModelList.size();
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
    public View getView(int pos, View view, ViewGroup viewGroup) {
        binding = MyListItemBinding.inflate(LayoutInflater.from(context),viewGroup,false);
        binding.tvName.setText(countryModelList.get(pos).getName());
        binding.tvIntro.setText(countryModelList.get(pos).getIntro());
        binding.flag.setImageResource(countryModelList.get(pos).getFlag());
        return null;
    }
}
