package com.example.makeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.makeapp.adapter.LipstickAdapter;
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
        teams.add(new Product(R.drawable.lipstick_chanel, "Chanel Rouge Allure Velvet La Raffine",1));
        teams.add(new Product(R.drawable.lipstick_clinique, "Clinique Lip Colour",2));
        teams.add(new Product(R.drawable.lipstick_kylie, "Kylie Matte Lip Kit",3));
        teams.add(new Product(R.drawable.lipstick_mac, "MAC Matte Lipstick Kinda Sexy",4));
        teams.add(new Product(R.drawable.lipstick_maybelline, "Maybelline Powder Matte",5));
        teams.add(new Product(R.drawable.lipstick_milani, "Milani Color Statement Lipstick Naturally",6));
        teams.add(new Product(R.drawable.lipstick_nars, "NARS Audacious Lipstick jane",7));
        teams.add(new Product(R.drawable.lipstick_revlon, "Super Lustrous Revlon",8));
        teams.add(new Product(R.drawable.lipstick_sephora, "Sephora",9));
        teams.add(new Product(R.drawable.lipstick_wardah, "Wardah Exclusive Moist",10));
        LipstickAdapter adapter = new LipstickAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
