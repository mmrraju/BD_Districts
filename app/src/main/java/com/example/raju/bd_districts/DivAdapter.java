package com.example.raju.bd_districts;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class DivAdapter extends RecyclerView.Adapter<DivViewHolder> {
    //private String[] divisionNames;
    ArrayList<String> divisionNames;
    Context context;
    //declare interface
    private OnItemClicked onClick;

    //make interface like this
    public interface OnItemClicked {
        void onItemClick(int position);
    }

    public DivAdapter(Context context , ArrayList<String> divisionNames) {
        this.divisionNames = divisionNames;
        this.context = context;
    }

    @NonNull
    @Override
    public DivViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.division_layout, parent, false);
        DivViewHolder divViewHolder=new DivViewHolder(view);

        return divViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DivViewHolder divViewHolder, final int position) {
        divViewHolder.divisionText.setText(divisionNames.get(position));

        divViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onItemClick(position);
            }
        });
        /*divViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(context,divisionNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });*/
    }
    @Override
    public int getItemCount() {
        return divisionNames.size();
    }
    public void setOnClick(OnItemClicked onClick)
    {
        this.onClick=onClick;
    }
}
