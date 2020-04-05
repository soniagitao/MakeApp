package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.FoundationAdapter;
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
        teams.add(new Product(R.drawable.found_benfit, "Benefit Hello Happy Soft Blur",1));
        teams.add(new Product(R.drawable.found_bobi, "Bobbi Brown Skin Long-Wear Weightless",2));
        teams.add(new Product(R.drawable.found_chanel, "Chanel Les Beiges Healthy Glow",3));
        teams.add(new Product(R.drawable.found_dior, "Dior Backstage",4));
        teams.add(new Product(R.drawable.found_estee, "Estee Lauder Double Wear",5));
        teams.add(new Product(R.drawable.found_jacob, "Marc Jacobs Re(marc)able",6));
        teams.add(new Product(R.drawable.found_loreal, "L'Oreal Infallible 24H Fresh Wear",7));
        teams.add(new Product(R.drawable.found_mac, "M.A.C Studio Fix Fluid",8));
        teams.add(new Product(R.drawable.found_maybelline, "Maybelline Fit Me!",9));
        teams.add(new Product(R.drawable.found_revlon, "Revlon Superstay 24hours",10));
        FoundationAdapter adapter = new FoundationAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
