package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

     RecyclerView recycler;
     List<Sport> sportList;

     CustomAdapter MyAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyclerview);

        sportList= new ArrayList<>();
        Sport s1 = new Sport("Football",R.drawable.football);
        Sport s2 = new Sport("Basketball",R.drawable.basketball);
        Sport s3 = new Sport("Ping",R.drawable.ping);
        Sport s4 = new Sport("Tennis",R.drawable.tennis);
        Sport s5 = new Sport("Volleyball",R.drawable.volley );

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);



        recycler.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter = new CustomAdapter(sportList);
        recycler.setAdapter(MyAdapter);

        MyAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this, "You Choose: " + sportList.get(pos).getSportName(), Toast.LENGTH_SHORT).show();
        
    }
}