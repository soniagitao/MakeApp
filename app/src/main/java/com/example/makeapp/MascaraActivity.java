package com.example.makeapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.makeapp.adapter.ProductAdapter;
import com.example.makeapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class MascaraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascara);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<Product> teams = new ArrayList<>();
        teams.add(new Product(R.drawable.mascara_bobi, "Bobbi Brown"));
        teams.add(new Product(R.drawable.mascara_dior, "Dior"));
        teams.add(new Product(R.drawable.mascara_loreal, "L'Oreal Paris Voluminous Lash Paradise"));
        teams.add(new Product(R.drawable.mascara_makeover, "Make Over"));
        teams.add(new Product(R.drawable.mascara_maybelline, "Maybelline volum' express hypercurl"));
        teams.add(new Product(R.drawable.mascara_mizzu, "Mizzu True Dimensional Lash"));
        teams.add(new Product(R.drawable.mascara_push, "Maybelline The Falsies Push Up Drama"));
        teams.add(new Product(R.drawable.mascara_sensa, "Maybelline Lash Sensational"));
        teams.add(new Product(R.drawable.mascara_silky, "SilkyGirl Big Eye Collagen Waterproof"));
        teams.add(new Product(R.drawable.mascara_too, "Too Faced Better Than Sex Mascara"));
        ProductAdapter adapter = new ProductAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
