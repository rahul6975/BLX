package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.CarResponseClasses.DataCarClasses;
import com.rahul.blx.ClickListeners.CarClickListener;
import com.rahul.blx.KolKataResponseClasses.DataKolkataClasses;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.CarsViewHolder;

import java.util.List;

public class CarViewAdapter extends RecyclerView.Adapter<CarsViewHolder> {
    private List<DataCarClasses> dataCarClassesList;
    private CarClickListener carClickListener;

    public CarViewAdapter(List<DataCarClasses> dataCarClassesList, CarClickListener carClickListener) {
        this.dataCarClassesList = dataCarClassesList;
        this.carClickListener = carClickListener;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_category_on_click_items, parent, false);
        return new CarsViewHolder(view,carClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        DataCarClasses dataCarClasses = dataCarClassesList.get(position);
        holder.setData(dataCarClasses);
    }

    @Override
    public int getItemCount() {
        return dataCarClassesList.size();
    }

    public void updateData(List<DataCarClasses> dataCarClasses) {
        this.dataCarClassesList = dataCarClasses;
        notifyDataSetChanged();
    }
}
