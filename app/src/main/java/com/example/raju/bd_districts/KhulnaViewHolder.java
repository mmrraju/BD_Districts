package com.example.raju.bd_districts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class KhulnaViewHolder extends RecyclerView.ViewHolder  {
    TextView khulnaText;

    public KhulnaViewHolder(@NonNull View itemView) {
        super(itemView);
        khulnaText=itemView.findViewById(R.id.khulnaText_id);

    }
}
