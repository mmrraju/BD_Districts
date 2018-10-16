package com.example.raju.bd_districts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class ChittagongActivity extends AppCompatActivity {
    RecyclerView recyclerViewChittagong;
    ArrayList<String> districtsOfChittagong =new ArrayList<>(Arrays.asList("Dhaka","Munshigong","Norshindi","Naraongong","Manikgong","Gazipur"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong);

        recyclerViewChittagong=findViewById(R.id.recyclerView_chittagong_id);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),1);
        recyclerViewChittagong.setLayoutManager(gridLayoutManager);

        ChittagongAdapter chittagongAdapter=new ChittagongAdapter(this, districtsOfChittagong);
        recyclerViewChittagong.setAdapter(chittagongAdapter);
    }
}
