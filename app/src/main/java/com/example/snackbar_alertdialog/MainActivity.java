package com.example.snackbar_alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btnShowSnackbar;
    CoordinatorLayout coordLayout;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowSnackbar = findViewById(R.id.btnShow);
        coordLayout = findViewById(R.id.coordLayout);
        alertDialog = new AlertDialog.Builder(this);
        AlertDialog alert = alertDialog.create();

//        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                alertDialog.setIcon(getDrawable(R.drawable.baseline_add_to_home_screen_24));
//                alertDialog.setTitle("This is an AlertDialog");
//                alertDialog.setMessage("Are you sure you want to exit this app?");
//                alertDialog.setCancelable(false);
//                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "You clicked YES", Toast.LENGTH_SHORT).show();
//                    }
//                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "You clicked NO", Toast.LENGTH_SHORT).show();
//                    }
//                }).setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        alert.cancel();
//                    }
//                });
//
////                alertDialog.create();
//                alertDialog.show();
//
//
//            }
//        });

//        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar snackbar = Snackbar.make(coordLayout, "This is a snackbar", Snackbar.LENGTH_INDEFINITE);
//                snackbar.setAction("Dismiss", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(MainActivity.this, "Snackbar Dismissed", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                snackbar.setBackgroundTint(Color.RED);
//                snackbar.setActionTextColor(Color.YELLOW);
//                snackbar.setTextColor(Color.YELLOW);
//                snackbar.show();
//            }
//        });


    }
}