package com.example.raju.bd_districts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DhakaAdapter extends RecyclerView.Adapter<DhakaViewHolder> {

    ArrayList<String> districtsOfDhaka;
    Context context;

    public DhakaAdapter(Context context , ArrayList<String> districtsOfDhaka) {
        this.districtsOfDhaka = districtsOfDhaka;
        this.context = context;
    }

    @NonNull
    @Override
    public DhakaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.dhaka_layout, parent, false);
        DhakaViewHolder dhakaViewHolder=new DhakaViewHolder(view);

        return dhakaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DhakaViewHolder dhakaViewHolderr, final int position) {
        dhakaViewHolderr.dhakaText.setText(districtsOfDhaka.get(position));

    }
    @Override
    public int getItemCount() {
        return districtsOfDhaka.size();
    }

}
