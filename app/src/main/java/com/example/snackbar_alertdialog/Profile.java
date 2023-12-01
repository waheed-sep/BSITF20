package com.example.snackbar_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    Button btnSave, btnRead;
    EditText edtName, edtCity, edtContact;
    TextView tvName, tvCity, tvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        edtName = findViewById(R.id.edtName);
        edtCity = findViewById(R.id.edtCity);
        edtContact = findViewById(R.id.edtPhone);
        tvName = findViewById(R.id.tvName);
        tvCity = findViewById(R.id.tvCity);
        tvContact = findViewById(R.id.tvPhone);
        btnRead = findViewById(R.id.btnReadData);
        btnSave = findViewById(R.id.btnSaveData);

        SharedPreferences spRead = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor spEditor = spRead.edit();


        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                spEditor.putString("name", edtName.getText().toString());
                spEditor.commit();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        edtCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                spEditor.putString("city", edtCity.getText().toString());
                spEditor.commit();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        edtContact.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                spEditor.putString("contact", edtContact.getText().toString());
                spEditor.commit();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(spRead.getString("name", "No data found"));
                edtCity.setText(spRead.getString("city", "No data found"));
                edtContact.setText(spRead.getString("contact", "No data found"));
            }
        });
    }
}