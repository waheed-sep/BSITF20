package com.example.bsitf20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContstraintLayout extends AppCompatActivity {
    Button btnGoback;
    TextView tvName, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contstraint_layout);

        tvName = findViewById(R.id.tvName);
        tvPassword = findViewById(R.id.tvPassword);
        btnGoback = findViewById(R.id.btnGoBack);

        Intent recIntent = getIntent();
        tvName.setText(recIntent.getStringExtra("name"));
        tvPassword.setText(recIntent.getStringExtra("password"));

        btnGoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoback = new Intent(ContstraintLayout.this, MainActivity.class);
                startActivity(intentGoback);
            }
        });
    }
}