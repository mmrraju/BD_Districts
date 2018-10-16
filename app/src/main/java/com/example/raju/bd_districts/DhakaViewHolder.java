package com.example.raju.bd_districts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DhakaViewHolder extends RecyclerView.ViewHolder {
    TextView dhakaText;
    public DhakaViewHolder(@NonNull View itemView) {
        super(itemView);
        dhakaText=itemView.findViewById(R.id.dhakaText_id);

    }
}
