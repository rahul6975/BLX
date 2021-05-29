package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.ClickListeners.PropertyClickListener;
import com.rahul.blx.DelhiResponseClasses.DataDelhiClasses;
import com.rahul.blx.PropertiesResponseClasses.DataPropertyClasses;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.PropertyViewHolder;

import java.util.List;

public class PropertyViewAdapter extends RecyclerView.Adapter<PropertyViewHolder> {
    private List<DataPropertyClasses> dataPropertyClassesList;
    private PropertyClickListener propertyClickListener;

    public PropertyViewAdapter(List<DataPropertyClasses> dataPropertyClassesList,PropertyClickListener propertyClickListener) {
        this.dataPropertyClassesList = dataPropertyClassesList;
        this.propertyClickListener = propertyClickListener;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_category_on_click_items, parent, false);
        return new PropertyViewHolder(view, propertyClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        DataPropertyClasses dataPropertyClasses = dataPropertyClassesList.get(position);
        holder.setData(dataPropertyClasses);
    }

    @Override
    public int getItemCount() {
        return dataPropertyClassesList.size();
    }

    public void updateData(List<DataPropertyClasses> dataPropertyClasses) {
        this.dataPropertyClassesList = dataPropertyClasses;
        notifyDataSetChanged();
    }
}
