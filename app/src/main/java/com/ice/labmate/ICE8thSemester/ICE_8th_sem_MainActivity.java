package com.ice.labmate.ICE8thSemester;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.ice.labmate.R;

public class ICE_8th_sem_MainActivity extends AppCompatActivity {
    MaterialCardView card_ice4212, card_ice4222, card_ice4262;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4th_main);

        card_ice4212= findViewById(R.id.card_ice4212);
        card_ice4212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_8th_sem_MainActivity.this, ICE4212MainActivity.class);
                startActivity(intent);
            }
        });

        card_ice4222= findViewById(R.id.card_ice4222);
        card_ice4222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_8th_sem_MainActivity.this, ICE4222MainActivity.class);
                startActivity(intent);
            }
        });

        card_ice4262= findViewById(R.id.card_ice4262);
        card_ice4262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_8th_sem_MainActivity.this, ICE4262MainActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to Logout?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}