package com.example.bsitf20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnGoto;
    EditText edtEmail, edtPassword;
    String email, password;
    TextView tvLogin;

    ListView lvStudents;
    ImageView imgFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnLogin = findViewById(R.id.btnLogin);
        btnGoto = findViewById(R.id.btnGoto);
//        edtEmail = findViewById(R.id.edtEmail);
//        edtPassword = findViewById(R.id.edtPassword);
        tvLogin = findViewById(R.id.tvLogin);
        imgFlag = findViewById(R.id.imgFlag);

        btnGoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent secondActivity = new Intent(MainActivity.this, ContstraintLayout.class);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW);
                gotoGoogle.setData(Uri.parse("033398471122"));
                startActivity(gotoGoogle);

            }
        });

        lvStudents = findViewById(R.id.lvStudents);
        int[] flags = {R.drawable.afghanistan, R.drawable.canada, R.drawable.pakistan, R.drawable.china, R.drawable.iran};
//        String[] arrStudents = {"Laraib", "Amna", "Kainat", "Iqra", "Sania", "Sakina", "Tayyaba", "Aiman", "Afshan", "Mahpara"};
        ArrayAdapter<String> adpStudents = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.countries_ur));
        lvStudents.setAdapter(adpStudents);
        lvStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
//                if (i == 0) {
//                    imgFlag.setImageResource(R.drawable.pakistan);
//                } else if ()

                switch (i) {
                    case 0:
                        imgFlag.setImageResource(R.drawable.pakistan);
                        break;
                    case 1:
                        imgFlag.setImageResource(R.drawable.afghanistan);
                        break;
                    case 2:
                        imgFlag.setImageResource(R.drawable.iran);
                }
            }
        });
//        edtEmail.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                tvLogin.setText(edtEmail.getText());
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                email = edtEmail.getText().toString();
//                password = edtPassword.getText().toString();
//                Toast.makeText(MainActivity.this, email + "\n" + password, Toast.LENGTH_LONG).show();
//            }
//        });
    }
}