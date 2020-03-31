package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.ProductAdapter;
import com.example.makeapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class FoundationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundation);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<Product> teams = new ArrayList<>();
        teams.add(new Product(R.drawable.found_benfit, "Benefit Hello Happy Soft Blur"));
        teams.add(new Product(R.drawable.found_bobi, "Bobbi Brown Skin Long-Wear Weightless"));
        teams.add(new Product(R.drawable.found_chanel, "Chanel Les Beiges Healthy Glow"));
        teams.add(new Product(R.drawable.found_dior, "Dior Backstage"));
        teams.add(new Product(R.drawable.found_estee, "Estee Lauder Double Wear"));
        teams.add(new Product(R.drawable.found_jacob, "Marc Jacobs Re(marc)able"));
        teams.add(new Product(R.drawable.found_loreal, "L'Oreal Infallible 24H Fresh Wear"));
        teams.add(new Product(R.drawable.found_mac, "M.A.C Studio Fix Fluid"));
        teams.add(new Product(R.drawable.found_maybelline, "Maybelline Fit Me!"));
        teams.add(new Product(R.drawable.found_revlon, "Revlon Superstay 24hours"));
        ProductAdapter adapter = new ProductAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
