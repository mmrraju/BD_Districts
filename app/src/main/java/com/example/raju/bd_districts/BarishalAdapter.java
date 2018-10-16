package com.example.raju.bd_districts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BarishalAdapter extends RecyclerView.Adapter<BarishalViewHolder> {

    ArrayList<String> districtsOfBarishal;
    Context context;

    public BarishalAdapter(Context context , ArrayList<String> districtsOfBarishal) {
        this.districtsOfBarishal = districtsOfBarishal;
        this.context = context;
    }

    @NonNull
    @Override
    public BarishalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.barishal_layout, parent, false);
        BarishalViewHolder barishalViewHolder=new BarishalViewHolder(view);

        return barishalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BarishalViewHolder barishalViewHolder, final int position) {
        barishalViewHolder.barishalText.setText(districtsOfBarishal.get(position));

    }
    @Override
    public int getItemCount() {
        return districtsOfBarishal.size();
    }

}
