package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.EyeshadowAdapter;
import com.example.makeapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class EyeshadowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyeshadow);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<Product> teams = new ArrayList<>();
        teams.add(new Product(R.drawable.eye_anastasia, "Anastasia Beverly Hills",1));
        teams.add(new Product(R.drawable.eye_city, "The City Mini Eyeshadow Pallete Maybelline",2));
        teams.add(new Product(R.drawable.eye_holika, "Holika Holika",3));
        teams.add(new Product(R.drawable.eye_huda, "Huda Beauty",4));
        teams.add(new Product(R.drawable.eye_juvia, "Juvia's Place The Nubian Pallete",5));
        teams.add(new Product(R.drawable.eye_la, "L.A Girl Eyeshadow Pallete",6));
        teams.add(new Product(R.drawable.eye_makeover, "Make over",7));
        teams.add(new Product(R.drawable.eye_maybelline, "Maybelline The Nudes Pallete",8));
        teams.add(new Product(R.drawable.eye_naked, "NAKED 2 Urban Decay",9));
        teams.add(new Product(R.drawable.eye_nars, "NARS Eye Pallete",10));
        EyeshadowAdapter adapter = new EyeshadowAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
