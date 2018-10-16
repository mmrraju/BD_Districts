package com.example.raju.bd_districts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import static android.support.v7.widget.RecyclerView.*;

public class ChittagongViewHolder extends RecyclerView.ViewHolder {
    TextView chittagongText;

    public ChittagongViewHolder(@NonNull View itemView) {
        super(itemView);
        chittagongText=itemView.findViewById(R.id.chittagongText_id);
    }
}
