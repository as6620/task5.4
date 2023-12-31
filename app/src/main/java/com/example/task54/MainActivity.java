package com.example.task54;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int counterClick = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
    }

    public void clicked(View view) {
        counterClick +=1;
        btn.setTextColor(Color.BLUE);
        tv.setTextColor(Color.RED);
        if (counterClick%7 != 0) {
            tv.setText("This is a click number:" + counterClick);
        }
        else
            tv.setText("BOOM!");
    }
}