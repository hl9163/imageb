package com.example.imageb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    Random random = new Random();


    ImageButton batu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.iV);

    }

    public void go(View view) {
        batu= (ImageButton) findViewById(R.id.imageButton3);

        int ran = random.nextInt(3);
        if (ran == 0){
            imageView1.setImageResource(R.drawable.v1);
            batu.setImageResource(R.drawable.num1);

        }
        else if (ran == 1){
            imageView1.setImageResource(R.drawable.v2);
            batu.setImageResource(R.drawable.num2);


        }
        else{
            imageView1.setImageResource(R.drawable.v3);
            batu.setImageResource(R.drawable.num3);

        }
    }
}