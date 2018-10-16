package com.example.raju.bd_districts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BarishalViewHolder extends RecyclerView.ViewHolder {
    TextView barishalText;
    public BarishalViewHolder(@NonNull View itemView) {
        super(itemView);
        barishalText=itemView.findViewById(R.id.barishalText_id);
    }

}
