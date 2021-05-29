package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.ClickListeners.BrowseCategoryClickListener;
import com.rahul.blx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.BrowseCategoriesViewHolder;

import java.util.ArrayList;

public class BrowseCategoriesAdapter extends RecyclerView.Adapter<BrowseCategoriesViewHolder> {

    private ArrayList<BrowseCategoriesModelClass> modelClassArrayList;
    private BrowseCategoryClickListener browseCategoryClickListener;

    public BrowseCategoriesAdapter(ArrayList<BrowseCategoriesModelClass> modelClassArrayList, BrowseCategoryClickListener browseCategoryClickListener) {
        this.browseCategoryClickListener = browseCategoryClickListener;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public BrowseCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_categories_items,parent,false);
        return new BrowseCategoriesViewHolder(view, browseCategoryClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BrowseCategoriesViewHolder holder, int position) {
        BrowseCategoriesModelClass modelClass = modelClassArrayList.get(position);
        holder.setData(modelClass);

    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }
}
