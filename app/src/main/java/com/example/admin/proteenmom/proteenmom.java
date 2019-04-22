package com.example.admin.proteenmom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class proteenmom extends AppCompatActivity {

    Calendar calendar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteenmom);

        //get month and get how many days in current month
        Calendar calendar = Calendar.getInstance();
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
      //  calendar.setWeekDate(52,52,7);
       // Calendar.setMaxDate(31);

        /*Calendar calendarview;
        calendar = (Calendar) findViewById(R.id. calendar);
        long a =  calendar.getCalendarType();
        calendar.setMaxDate(a);*/

        Button btnRecomend = findViewById(R.id.btnRecomend);
        btnRecomend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(proteenmom.this,RecommendActivity.class);
                startActivity(intent);
                }
        }

        );

        /*Button btn_first = findViewById(R.id.btn_first);
        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(proteenmom.this,MainActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
