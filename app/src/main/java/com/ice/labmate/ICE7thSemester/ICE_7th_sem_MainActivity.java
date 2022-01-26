package com.ice.labmate.ICE7thSemester;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.ice.labmate.R;

public class ICE_7th_sem_MainActivity extends AppCompatActivity {
    MaterialCardView card_ice4112, card_ice4122, card_ice4132;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice5th_main);

        card_ice4112= findViewById(R.id.card_ice4112);
        card_ice4112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_7th_sem_MainActivity.this, ICE4112MainActivity.class);
                startActivity(intent);
            }
        });

        card_ice4122= findViewById(R.id.card_ice4122);
        card_ice4122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_7th_sem_MainActivity.this, ICE4122MainActivity.class);
                startActivity(intent);
            }
        });

        card_ice4132= findViewById(R.id.card_ice4132);
        card_ice4132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE_7th_sem_MainActivity.this, ICE4132MainActivity.class);
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