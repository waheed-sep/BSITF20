package com.example.bsitf20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnGoto;
    EditText edtName, edtPassword;
    String email, password;
    TextView tvLogin;

    ListView lvStudents;
    ImageView imgFlag;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        menu.setHeaderIcon(R.drawable.pakistan);
        menu.setHeaderTitle("Select Menu");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle item selection

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnLogin = findViewById(R.id.btnLogin);
        btnGoto = findViewById(R.id.btnGoto);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
//        tvLogin = findViewById(R.id.tvLogin);
        imgFlag = findViewById(R.id.imgFlag);

        registerForContextMenu(btnGoto);

        btnGoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String name, password;
//                name = edtName.getText().toString();
//                password = edtPassword.getText().toString();
//                Intent secondActivity = new Intent(MainActivity.this, ContstraintLayout.class);
//                if (TextUtils.isEmpty(edtName.getText())) {
//                    edtName.setError("Name field cannot be blank");
//                } else if (TextUtils.isEmpty(edtPassword.getText())) {
//                    edtPassword.setError("Password field cannot be blank");
//                } else {
//                    secondActivity.putExtra("name", name);
//                    secondActivity.putExtra("password", password);
//                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW);
//                gotoGoogle.setData(Uri.parse("www.google.com.pk"));
//                    startActivity(secondActivity);
//                }
//
//
            }
        });

//        lvStudents = findViewById(R.id.lvStudents);
//        int[] flags = {R.drawable.afghanistan, R.drawable.canada, R.drawable.pakistan, R.drawable.china, R.drawable.iran};
//        String[] arrStudents = {"Laraib", "Amna", "Kainat", "Iqra", "Sania", "Sakina", "Tayyaba", "Aiman", "Afshan", "Mahpara"};
        ArrayAdapter<String> adpStudents = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.countries_ur));
//        lvStudents.setAdapter(adpStudents);
//        lvStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
////                if (i == 0) {
////                    imgFlag.setImageResource(R.drawable.pakistan);
////                } else if ()
//
//                switch (i) {
//                    case 0:
//                        imgFlag.setImageResource(R.drawable.pakistan);
//                        break;
//                    case 1:
//                        imgFlag.setImageResource(R.drawable.afghanistan);
//                        break;
//                    case 2:
//                        imgFlag.setImageResource(R.drawable.iran);
//                }
//            }
//        });
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