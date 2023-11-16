package com.example.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.DigimonModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DigimonAdapter extends RecyclerView.Adapter<DigimonHolder> {
    private Context context;
    private List<DigimonModel> digimons;

    public DigimonAdapter(Context context, List<DigimonModel> digimons) {
        this.context = context;
        this.digimons = digimons;
    }

    @NonNull
    @Override
    public DigimonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DigimonHolder(LayoutInflater.from(context).inflate(R.layout.item_digimon,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonHolder holder, int position) {
        holder.getName().setText(digimons.get(position).getName());
        holder.getLvl().setText(digimons.get(position).getLvl());
        Picasso.get().load(digimons.get(position).getImg()).into(holder.getImg());
    }

    @Override
    public int getItemCount() {
        return digimons.size();
    }
}
