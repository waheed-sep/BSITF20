package com.example.snackbar_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class GPACalculator extends AppCompatActivity {
    String strCHSub1, strCHSub2, strCHSub3, strCHSub4, strCHSub5;
    String strGradeSub1, strGradeSub2, strGradeSub3, strGradeSub4, strGradeSub5;
    Spinner spnCHSub1, spnCHSub2, spnCHSub3, spnCHSub4, spnCHSub5, spnGradeSub1, spnGradeSub2,
            spnGradeSub3, spnGradeSub4, spnGradeSub5;
    int TotalCreditHours;
    float TotalGradePointsSub1, TotalGradePointsSub2, TotalGradePointsSub3, TotalGradePointsSub4, TotalGradePointsSub5, GPA;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalculator);

        btnCalculate = findViewById(R.id.btnCalculate);
        spnCHSub1 = findViewById(R.id.spnSub1CH);
        spnCHSub2 = findViewById(R.id.spnSub2CH);
        spnCHSub3 = findViewById(R.id.spnSub3CH);
        spnCHSub4 = findViewById(R.id.spnSub4CH);
        spnCHSub5 = findViewById(R.id.spnSub5CH);
        spnGradeSub1 = findViewById(R.id.spnSub1Grade);
        spnGradeSub2 = findViewById(R.id.spnSub2Grade);
        spnGradeSub3 = findViewById(R.id.spnSub3Grade);
        spnGradeSub4 = findViewById(R.id.spnSub4Grade);
        spnGradeSub5 = findViewById(R.id.spnSub5Grade);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strCHSub1 = spnCHSub1.getSelectedItem().toString();
                strCHSub2 = spnCHSub2.getSelectedItem().toString();
                strCHSub3 = spnCHSub3.getSelectedItem().toString();
                strCHSub4 = spnCHSub4.getSelectedItem().toString();
                strCHSub5 = spnCHSub5.getSelectedItem().toString();
                strGradeSub1 = spnGradeSub1.getSelectedItem().toString();
                strGradeSub2 = spnGradeSub2.getSelectedItem().toString();
                strGradeSub3 = spnGradeSub3.getSelectedItem().toString();
                strGradeSub4 = spnGradeSub4.getSelectedItem().toString();
                strGradeSub5 = spnGradeSub5.getSelectedItem().toString();

                TotalCreditHours = Integer.parseInt(strCHSub1) + Integer.parseInt(strCHSub2) + Integer.parseInt(strCHSub3) + Integer.parseInt(strCHSub4) + Integer.parseInt(strCHSub5);


                /////Grade Points for Subject 1
                if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "A")) {
                    TotalGradePointsSub1 = 4f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "B+")) {
                    TotalGradePointsSub1 = 3.5f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "B")) {
                    TotalGradePointsSub1 = 3f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "C+")) {
                    TotalGradePointsSub1 = 2.5f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "C")) {
                    TotalGradePointsSub1 = 2f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "D+")) {
                    TotalGradePointsSub1 = 1.5f;
                } else if (TextUtils.equals(spnGradeSub1.getSelectedItem().toString(), "D")) {
                    TotalGradePointsSub1 = 1f;
                } else {
                    TotalGradePointsSub1 = 0f;
                }

                TotalGradePointsSub1 *= Integer.parseInt(strCHSub1);


                /////Grade Points for Subject 2
                if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "A")) {
                    TotalGradePointsSub2 = 4f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "B+")) {
                    TotalGradePointsSub2 = 3.5f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "B")) {
                    TotalGradePointsSub2 = 3f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "C+")) {
                    TotalGradePointsSub2 = 2.5f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "C")) {
                    TotalGradePointsSub2 = 2f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "D+")) {
                    TotalGradePointsSub2 = 1.5f;
                } else if (TextUtils.equals(spnGradeSub2.getSelectedItem().toString(), "D")) {
                    TotalGradePointsSub2 = 1f;
                } else {
                    TotalGradePointsSub2 = 0f;
                }

                TotalGradePointsSub2 *= Integer.parseInt(strCHSub2);

                /////Grade Points for Subject 3
                if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "A")) {
                    TotalGradePointsSub3 = 4f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "B+")) {
                    TotalGradePointsSub3 = 3.5f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "B")) {
                    TotalGradePointsSub3 = 3f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "C+")) {
                    TotalGradePointsSub3 = 2.5f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "C")) {
                    TotalGradePointsSub3 = 2f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "D+")) {
                    TotalGradePointsSub3 = 1.5f;
                } else if (TextUtils.equals(spnGradeSub3.getSelectedItem().toString(), "D")) {
                    TotalGradePointsSub3 = 1f;
                } else {
                    TotalGradePointsSub3 = 0f;
                }

                TotalGradePointsSub3 *= Integer.parseInt(strCHSub3);


                /////Grade Points for Subject 4
                if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "A")) {
                    TotalGradePointsSub4 = 4f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "B+")) {
                    TotalGradePointsSub4 = 3.5f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "B")) {
                    TotalGradePointsSub4 = 3f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "C+")) {
                    TotalGradePointsSub4 = 2.5f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "C")) {
                    TotalGradePointsSub4 = 2f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "D+")) {
                    TotalGradePointsSub4 = 1.5f;
                } else if (TextUtils.equals(spnGradeSub4.getSelectedItem().toString(), "D")) {
                    TotalGradePointsSub4 = 1f;
                } else {
                    TotalGradePointsSub4 = 0f;
                }

                TotalGradePointsSub4 *= Integer.parseInt(strCHSub4);


                /////Grade Points for Subject 5
                if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "A")) {
                    TotalGradePointsSub5 = 4f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "B+")) {
                    TotalGradePointsSub5 = 3.5f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "B")) {
                    TotalGradePointsSub5 = 3f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "C+")) {
                    TotalGradePointsSub5 = 2.5f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "C")) {
                    TotalGradePointsSub5 = 2f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "D+")) {
                    TotalGradePointsSub5 = 1.5f;
                } else if (TextUtils.equals(spnGradeSub5.getSelectedItem().toString(), "D")) {
                    TotalGradePointsSub5 = 1f;
                } else {
                    TotalGradePointsSub5 = 0f;
                }

                TotalGradePointsSub5 *= Integer.parseInt(strCHSub5);
                GPA = (TotalGradePointsSub1 + TotalGradePointsSub2 + TotalGradePointsSub3 + TotalGradePointsSub4 + TotalGradePointsSub5) / TotalCreditHours;
                tvResult.setText(String.valueOf(GPA).substring(0, 3));
            }
        });
    }
}