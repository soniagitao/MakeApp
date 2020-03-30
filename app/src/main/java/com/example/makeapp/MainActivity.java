package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.MainAdapter;
import com.example.makeapp.models.MakeupLogo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<MakeupLogo> teams = new ArrayList<>();
        teams.add(new MakeupLogo(R.drawable.maskara, "Mascara", 1));
        teams.add(new MakeupLogo(R.drawable.eyeshadow, "Eye Shadow", 2));
        teams.add(new MakeupLogo(R.drawable.blush, "Blush On", 3));
        teams.add(new MakeupLogo(R.drawable.foundation, "Foundation", 4));
        teams.add(new MakeupLogo(R.drawable.lipstick, "Lipstick", 5));

        MainAdapter adapter = new MainAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
