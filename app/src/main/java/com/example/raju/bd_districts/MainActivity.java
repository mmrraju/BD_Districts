package com.example.raju.bd_districts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements DivAdapter.OnItemClicked{
    RecyclerView recyclerViewDiv;
    ArrayList<String> divisonNames =new ArrayList<>(Arrays.asList("Dhaka","Mymensing","Chittagong","Rajshahi","Khulna","Barishal","Sylhet","Rangpur"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewDiv=findViewById(R.id.recyclerView_Division_id);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getApplicationContext(),2);
        recyclerViewDiv.setLayoutManager(gridLayoutManager);

        DivAdapter divAdapter=new DivAdapter(this, divisonNames);

        recyclerViewDiv.setAdapter(divAdapter);
        divAdapter.setOnClick(MainActivity.this);

    }

    @Override
    public void onItemClick(int position) {
        if(position==0)
        {
            Intent intent= new Intent(MainActivity.this, DhakaActivity.class);
            startActivity(intent);
        }
        else if(position==1)
        {
            Intent intent= new Intent(MainActivity.this, MymensinghActivity.class);
            startActivity(intent);
        }
        else if(position==2)
        {
            Intent intent= new Intent(MainActivity.this, ChittagongActivity.class);
            startActivity(intent);
        }
        else if(position==3)
        {
            Intent intent= new Intent(MainActivity.this, RajshahiActivity.class);
            startActivity(intent);
        }
        else if(position==4)
        {
            Intent intent= new Intent(MainActivity.this, KhulnaActivity.class);
            startActivity(intent);
        }
        else if(position==5)
        {
            Intent intent= new Intent(MainActivity.this, BarishalActivity.class);
            startActivity(intent);
        }
        else if(position==6)
        {
            Intent intent= new Intent(MainActivity.this, SylhetActivity.class);
            startActivity(intent);
        }
        else if(position==7)
        {
            Intent intent= new Intent(MainActivity.this, RangpurActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,divisonNames.get(position),Toast.LENGTH_SHORT).show();
        }

    }
}
