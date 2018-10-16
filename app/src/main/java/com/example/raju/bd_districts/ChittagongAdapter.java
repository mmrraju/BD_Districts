package com.example.raju.bd_districts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChittagongAdapter extends RecyclerView.Adapter<ChittagongViewHolder> {

    ArrayList<String> districtsOfChittagong;
    Context context;

    public ChittagongAdapter(Context context , ArrayList<String> districtsOfChittagong) {
        this.districtsOfChittagong = districtsOfChittagong;
        this.context = context;
    }

    @NonNull
    @Override
    public ChittagongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.chittagong_layout, parent, false);
        ChittagongViewHolder chittagongViewHolder=new ChittagongViewHolder(view);

        return chittagongViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChittagongViewHolder chittagongViewHolder, final int position) {
        chittagongViewHolder.chittagongText.setText(districtsOfChittagong.get(position));

    }
    @Override
    public int getItemCount() {
        return districtsOfChittagong.size();
    }

}
