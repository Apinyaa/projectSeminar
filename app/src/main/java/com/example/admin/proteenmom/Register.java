package com.example.admin.proteenmom;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Register extends AppCompatActivity {

    EditText edt_period;
    DatePickerDialog dpk;

    int year,month,day;
    Calendar c = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        edt_period = findViewById(R.id.edt_period);

        edt_period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==edt_period){

                    DatePickerDialog dpk = new DatePickerDialog(Register.this,date,c.get(Calendar.YEAR),c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                    dpk.show();
                }
            }

            DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    c.set(Calendar.YEAR, year);
                    c.set(Calendar.MONTH, monthOfYear);
                    c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    monthOfYear = monthOfYear + 1;
                    edt_period.setText(year+"/"+monthOfYear+"/"+dayOfMonth);
                }
            };
        });
    }


}
