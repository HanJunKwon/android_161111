package com.example.pc.myapplication;

import android.graphics.Color;
import android.icu.util.Calendar;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;
    TextView tv1;
    Button b1;
    CheckBox cb1;
    RadioButton rb1;
    RadioButton rb2;
    RatingBar ratBar1;
    CalendarView cv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout)findViewById(R.id.activity_main);
        setTextView();
        setCheckBox();
        setRadioButton();
        setRatingBar();
        setCalendar();
    }

    void setTextView(){
        tv1 = (TextView)findViewById(R.id.textView);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hello world", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setCheckBox(){
        cb1 = (CheckBox)findViewById(R.id.checkBox);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked())
                    layout1.setBackgroundColor(Color.BLUE);
                else
                    layout1.setBackgroundColor(Color.WHITE);
            }
        });
    }

    void setRadioButton(){
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked())
                    Toast.makeText(getApplicationContext(), "여자입니다", Toast.LENGTH_SHORT).show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb2.isChecked())
                    Toast.makeText(getApplicationContext(),"남자입니다", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setRatingBar(){
        ratBar1 = (RatingBar)findViewById(R.id.ratingBar);
        ratBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),rating+"점입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setCalendar(){
        cv1 = (CalendarView)findViewById(R.id.calendarView);
        cv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), year+"년 "+(month+1)+"월 "+dayOfMonth+"일",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
