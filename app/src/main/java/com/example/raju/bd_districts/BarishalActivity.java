package com.example.raju.bd_districts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class BarishalActivity extends AppCompatActivity {
    RecyclerView recyclerViewBarishal;
    ArrayList<String> districtsOfBarishal =new ArrayList<>(Arrays.asList("Dhaka","Munshigong","Norshindi","Naraongong","Manikgong","Gazipur","KishorGong","Jamalpur","Sherpur","Netrokona"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal);

        recyclerViewBarishal=findViewById(R.id.recyclerView_Barishal_id);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),1);
        recyclerViewBarishal.setLayoutManager(gridLayoutManager);

        BarishalAdapter barishalAdapter=new BarishalAdapter(this, districtsOfBarishal);
        recyclerViewBarishal.setAdapter(barishalAdapter);
    }
}
