package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.BikesResponseClasses.DataClass;
import com.rahul.blx.ClickListeners.BikeClickListener;
import com.rahul.blx.JobsReponseClasses.DataJobClasses;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.BikesViewHolder;

import java.util.List;

public class BikesViewAdapter extends RecyclerView.Adapter<BikesViewHolder> {
    private List<DataClass> dataClassList;
    private BikeClickListener bikeClickListener;

    public BikesViewAdapter(List<DataClass> dataClassList, BikeClickListener bikeClickListener) {
        this.bikeClickListener =bikeClickListener;
        this.dataClassList = dataClassList;
    }

    @NonNull
    @Override
    public BikesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_category_on_click_items, parent, false);
        return new BikesViewHolder(view,bikeClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BikesViewHolder holder, int position) {
        DataClass dataClass = dataClassList.get(position);
        holder.setData(dataClass);
    }

    @Override
    public int getItemCount() {
        return dataClassList.size();
    }

    public void updateData(List<DataClass> dataJobClassesList) {
        this.dataClassList = dataJobClassesList;
        notifyDataSetChanged();
    }
}
