package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.AllInOneResponseClasses.DataClasses;
import com.rahul.blx.BikesResponseClasses.DataClass;
import com.rahul.blx.ClickListeners.AllInOneClickListener;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.AllInOneViewHolder;

import java.util.List;

public class AllInOneViewAdapter extends RecyclerView.Adapter<AllInOneViewHolder> {
    private List<DataClasses> dataClassesArrayList;
    private AllInOneClickListener allInOneClickListener;

    public AllInOneViewAdapter(List<DataClasses> dataClassesArrayList , AllInOneClickListener allInOneClickListener) {
        this.dataClassesArrayList = dataClassesArrayList;
        this.allInOneClickListener = allInOneClickListener;
    }

    @NonNull
    @Override
    public AllInOneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_in_one_items_list,parent,false);
        return new AllInOneViewHolder(view, allInOneClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AllInOneViewHolder holder, int position) {
        DataClasses dataClasses = dataClassesArrayList.get(position);
        holder.setData(dataClasses);

    }

    @Override
    public int getItemCount() {
        return dataClassesArrayList.size();
    }

    public void updateDataFromApi(List<DataClasses> dataClasses)
    {
        this.dataClassesArrayList = dataClasses;
        notifyDataSetChanged();
    }
}
