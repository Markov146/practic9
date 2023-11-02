package com.example.myapplication22;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.myapplication22.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        ArrayList<Game> gamesList = new ArrayList<>();
        gamesList.add(new Game("SleepengDogs",R.drawable.among));
        gamesList.add(new Game("Rust",R.drawable.civ));
        gamesList.add(new Game("Call of Duty",R.drawable.call));
        gamesList.add(new Game("World of Thanks",R.drawable.eith));
        gamesList.add(new Game("Amoung Us",R.drawable.eleven));
        gamesList.add(new Game("Minecraft",R.drawable.enlisted));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new GameAdapter(this, gamesList));

    }
}