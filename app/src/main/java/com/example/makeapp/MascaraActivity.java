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
        teams.add(new Product(R.drawable.mascara_bobi, "Bobbi Brown", 1));
        teams.add(new Product(R.drawable.mascara_dior, "Dior", 2));
        teams.add(new Product(R.drawable.mascara_loreal, "L'Oreal Paris Voluminous Lash Paradise", 3));
        teams.add(new Product(R.drawable.mascara_makeover, "Make Over", 4));
        teams.add(new Product(R.drawable.mascara_maybelline, "Maybelline volum' express hypercurl",5 ));
        teams.add(new Product(R.drawable.mascara_mizzu, "Mizzu True Dimensional Lash", 6));
        teams.add(new Product(R.drawable.mascara_push, "Maybelline The Falsies Push Up Drama", 7));
        teams.add(new Product(R.drawable.mascara_sensa, "Maybelline Lash Sensational", 8));
        teams.add(new Product(R.drawable.mascara_silky, "SilkyGirl Big Eye Collagen Waterproof", 9));
        teams.add(new Product(R.drawable.mascara_too, "Too Faced Better Than Sex Mascara", 10));
        ProductAdapter adapter = new ProductAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
