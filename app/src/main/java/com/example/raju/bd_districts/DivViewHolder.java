package com.example.raju.bd_districts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DivViewHolder extends RecyclerView.ViewHolder {

    TextView divisionText;

    public DivViewHolder(@NonNull View itemView) {
        super(itemView);

        divisionText=itemView.findViewById(R.id.division_id);
    }
}
