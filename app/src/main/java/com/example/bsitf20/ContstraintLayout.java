package com.example.bsitf20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContstraintLayout extends AppCompatActivity {
    Button btnGoback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contstraint_layout);

        btnGoback = findViewById(R.id.btnGoBack);
        btnGoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoback = new Intent(ContstraintLayout.this, MainActivity.class);
                startActivity(intentGoback);
            }
        });
    }
}