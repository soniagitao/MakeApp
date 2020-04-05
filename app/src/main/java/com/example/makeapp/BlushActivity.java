package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.BlushAdapter;
import com.example.makeapp.adapter.ProductAdapter;
import com.example.makeapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class BlushActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blush);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<Product> teams = new ArrayList<>();
        teams.add(new Product(R.drawable.blush_benefit, "Benefit GALifornia Powder Blush",1));
        teams.add(new Product(R.drawable.blush_bobi, "Bobbi Brown Blush Nectar",2));
        teams.add(new Product(R.drawable.blush_catrice, "Catrice Blush Box",3));
        teams.add(new Product(R.drawable.blush_chanel, "Joues Contraste Powder Blush",4));
        teams.add(new Product(R.drawable.blush_jacob, "Air Blush Soft Glow Duo",5));
        teams.add(new Product(R.drawable.blush_makeover, "Make Over Single",6));
        teams.add(new Product(R.drawable.blush_maybelline, "Maybelline Fit Me Blush!",7));
        teams.add(new Product(R.drawable.blush_nyx, "NYX High Definition Blush",8));
        teams.add(new Product(R.drawable.blush_tbs, "The Body Shop",9));
        teams.add(new Product(R.drawable.blush_wardah, "Wardah Blush On",10));
        BlushAdapter adapter = new BlushAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
