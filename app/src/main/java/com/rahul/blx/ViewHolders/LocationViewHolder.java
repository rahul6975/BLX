package com.rahul.blx.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.Activities.LocationModelClass;
import com.rahul.blx.R;

public class LocationViewHolder extends RecyclerView.ViewHolder {
    private TextView tvState;

    public LocationViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        tvState = itemView.findViewById(R.id.tvState);
    }
    public  void setData(LocationModelClass modelClass)
    {
        tvState.setText(modelClass.getState());
    }
}
