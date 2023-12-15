package com.example.myaero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1 =findViewById(R.id.button);
        Button b2 =findViewById(R.id.butto);
        b1.setBackgroundColor(getResources().getColor(R.color.white));
        b2.setBackgroundColor(getResources().getColor(R.color.or));
        TextView textViewGreeting = findViewById(R.id.textView3);
        String greeting = getGreeting();
        textViewGreeting.setText(greeting);



//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), connActivity.class);
//                startActivity(intent);
//            }
//        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,connActivity.class);
                startActivity(intent);
            }
        });

    }


    private String getGreeting() {
        //SimpleDateFormat sdf = new SimpleDateFormat("HH", Locale.getDefault());
        SimpleDateFormat sdf = new SimpleDateFormat("HH", Locale.getDefault());
        String currentTime = sdf.format(new Date());
        int hour = Integer.parseInt(currentTime);

        if (hour >= 0 && hour < 12) {
            return "                       Bonjour !";
        } else if (hour < 18) {
            return "                       Bon après-midi !";
        } else {
            return "                       Bonsoir !";
        }

    }

}