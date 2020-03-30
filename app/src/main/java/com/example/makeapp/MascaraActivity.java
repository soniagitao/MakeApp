package com.example.makeapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.makeapp.adapter.ProductAdapter;
import com.example.makeapp.models.MakeupLogo;

import java.util.ArrayList;
import java.util.List;

public class MascaraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascara);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<MakeupLogo> teams = new ArrayList<>();
        teams.add(new MakeupLogo(R.drawable.maskara, "Mascara"));
        teams.add(new MakeupLogo(R.drawable.eyeshadow, "Eye Shadow"));
        teams.add(new MakeupLogo(R.drawable.blush, "Blush On"));
        teams.add(new MakeupLogo(R.drawable.foundation, "Foundation"));
        teams.add(new MakeupLogo(R.drawable.lipstick, "Lipstick"));

        ProductAdapter adapter = new ProductAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
