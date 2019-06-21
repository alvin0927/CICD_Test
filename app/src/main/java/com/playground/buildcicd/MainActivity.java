package com.playground.buildcicd;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        tvHello.setBackgroundColor(Color.BLUE);
        tvHello.setText("Hello，Jenkins");

    }

    private void initUI(){
        tvHello = findViewById(R.id.tvHello);
    }
}
