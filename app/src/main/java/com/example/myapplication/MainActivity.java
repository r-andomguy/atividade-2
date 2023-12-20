package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer count = 0;
    private TextView textCount;
    private TextView textCountInfo;
    private Button plus;
    private Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.textCount);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        textCountInfo = findViewById(R.id.textCountInfo);
        textCount.setText(String.valueOf(this.getCount()));
    }

    public Integer getCount(){
        return this.count;
    }

    public void add(View view){
        this.count++;
        textCount.setText(String.valueOf(this.getCount()));
    }

    public void sub(View view){
        this.count--;
        textCount.setText(String.valueOf(this.getCount()));
    }

    public void getInfo(View view) {
        Intent i = new Intent(MainActivity.this, InfoActivity.class);
        i.putExtra("count", this.count);
        startActivity(i);
    }
}