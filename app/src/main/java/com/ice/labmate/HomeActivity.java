package com.ice.labmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {
    MaterialCardView card_8th, card_7th, card_6th, card_5th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card_8th = findViewById(R.id.card_8th);
        card_8th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginMainActivity.class);
                startActivity(intent);
            }
        });

        card_7th = findViewById(R.id.card_7th);
        card_7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginMainActivity.class);
                startActivity(intent);
            }
        });
        card_6th = findViewById(R.id.card_6th);
        card_6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginMainActivity.class);
                startActivity(intent);
            }
        });
        card_5th = findViewById(R.id.card_5th);
        card_5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginMainActivity.class);
                startActivity(intent);
            }
        });

    }
}