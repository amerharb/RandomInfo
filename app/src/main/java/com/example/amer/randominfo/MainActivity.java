package com.example.amer.randominfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView t;
    ImageView v;

    String info[] = {"Name: Nancy\nAge: 19"
            , "Name: Bill\nAge: 22\nPlace: Malmö"
            , "Name: Jack\nAge: 42\nPlace: Copenhagen"
            , "Name: Brad\nAge: 44\nPlace: Stockholm"
            , "Name: Michael\nAge: 64\nPlace: Kristianstad"
            , "Name: Lisa\nAge: 55\nPlace: Halmstad"
            , "Name: Lu\nAge: 34\nPlace: Trellborg"
            , "Name: Hanna\nAge: 33\nPlace: Damascus"
            , "Name: Lucy\nAge: 46\nPlace: Dubai"
            , "Name: Tom\nAge: 39\nPlace: Cairo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.label);
        v = (ImageView) findViewById(R.id.imageView);
    }

    public void clk(View btn) {

        Random r = new Random();
        int i = r.nextInt(10);

        t.setText(info[i]);

        if (i == 0) {
            v.setImageResource(R.drawable.f0);
        } else if (i == 1) {
            v.setImageResource(R.drawable.f1);
        } else if (i == 2) {
            v.setImageResource(R.drawable.f2);
        } else if (i == 3) {
            v.setImageResource(R.drawable.f3);
        } else if (i == 4) {
            v.setImageResource(R.drawable.f4);
        } else if (i == 5) {
            v.setImageResource(R.drawable.f5);
        } else if (i == 6) {
            v.setImageResource(R.drawable.f6);
        } else if (i == 7) {
            v.setImageResource(R.drawable.f7);
        } else if (i == 8) {
            v.setImageResource(R.drawable.f8);
        } else if (i == 9) {
            v.setImageResource(R.drawable.f9);
        }
    }
}