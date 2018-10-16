package com.example.raju.bd_districts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class KhulnaActivity extends AppCompatActivity {
    RecyclerView recyclerViewKhulna;
    ArrayList<String> districtsOfKhulna =new ArrayList<>(Arrays.asList("Dhaka","Munshigong","Norshindi","Naraongong","Manikgong","Gazipur","KishorGong","Jamalpur","Sherpur","Netrokona"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        recyclerViewKhulna=findViewById(R.id.recyclerView_Khulna_id);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),1);
        recyclerViewKhulna.setLayoutManager(gridLayoutManager);

        KhulnaAdapter khulnaAdapter=new KhulnaAdapter(this, districtsOfKhulna);
        recyclerViewKhulna.setAdapter(khulnaAdapter);
    }
}
