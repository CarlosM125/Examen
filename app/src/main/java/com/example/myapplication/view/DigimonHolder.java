package com.example.myapplication.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class DigimonHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView lvl;

    private ImageView img;

    public TextView getName() {
        return name;
    }

    public TextView getLvl() {
        return lvl;
    }

    public ImageView getImg() {
        return img;
    }


    public DigimonHolder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.txtName);
        this.lvl = itemView.findViewById(R.id.txtlvl);
        this.img = itemView.findViewById(R.id.image);
    }
}
