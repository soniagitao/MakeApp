package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.ProductAdapter;
import com.example.makeapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class LipstickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipstick);

        RecyclerView teamsView = findViewById(R.id.rv_makeup);

        List<Product> teams = new ArrayList<>();
        teams.add(new Product(R.drawable.lipstick_chanel, "Chanel Rouge Allure Velvet La Raffine"));
        teams.add(new Product(R.drawable.lipstick_clinique, "Clinique Lip Colour"));
        teams.add(new Product(R.drawable.lipstick_kylie, "Kylie Matte Lip Kit"));
        teams.add(new Product(R.drawable.lipstick_mac, "MAC Matte Lipstick Kinda Sexy"));
        teams.add(new Product(R.drawable.lipstick_maybelline, "Maybelline Powder Matte"));
        teams.add(new Product(R.drawable.lipstick_milani, "Milani Color Statement Lipstick Naturally"));
        teams.add(new Product(R.drawable.lipstick_nars, "NARS Audacious Lipstick jane"));
        teams.add(new Product(R.drawable.lipstick_revlon, "Super Lustrous Revlon"));
        teams.add(new Product(R.drawable.lipstick_sephora, "Sephora"));
        teams.add(new Product(R.drawable.lipstick_wardah, "Wardah Exclusive Moist"));
        ProductAdapter adapter = new ProductAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
