package com.rahul.blx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.blx.ClickListeners.KolkataClickListener;
import com.rahul.blx.KolKataResponseClasses.DataKolkataClasses;
import com.rahul.blx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.blx.R;
import com.rahul.blx.ViewHolders.KolkataViewHolder;

import java.util.List;

public class KolkataViewAdapter extends RecyclerView.Adapter<KolkataViewHolder> {
    private List<DataKolkataClasses> dataKolkataClassesList;
    private KolkataClickListener kolkataClickListener;

    public KolkataViewAdapter(List<DataKolkataClasses> dataKolkataClassesList,KolkataClickListener kolkataClickListener) {
        this.dataKolkataClassesList = dataKolkataClassesList;
        this.kolkataClickListener = kolkataClickListener;
    }

    @NonNull
    @Override
    public KolkataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_for_mumbai,parent,false);

        return new KolkataViewHolder(view, kolkataClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull KolkataViewHolder holder, int position) {
        DataKolkataClasses dataKolkataClasses = dataKolkataClassesList.get(position);
        holder.setData(dataKolkataClasses);

    }

    @Override
    public int getItemCount() {
        return dataKolkataClassesList.size();
    }

    public void updateData(List<DataKolkataClasses> dataKolkataClasses)
    {
        this.dataKolkataClassesList = dataKolkataClasses;
        notifyDataSetChanged();
    }
}
