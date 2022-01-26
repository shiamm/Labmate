package com.ice.labmate.ICE8thSemester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.ice.labmate.R;

public class ICE4212MainActivity extends AppCompatActivity {
private MaterialButton btn_ice4212_lab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4212_main);

        btn_ice4212_lab=findViewById(R.id.btn_ice4212_lab);
        btn_ice4212_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab Material%2FICE4th%2F4212%2FSystem Analysis and Software Engineering Lab Mannual.docx?alt=media&token=30a232bb-5633-415b-aff5-2f1959e37811"));
                startActivity(intent);
            }
        });
    }
}