package com.example.myaero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends Fragment {


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_main, container, true);

        Button b1 =root.findViewById(R.id.button);
        Button b2 = root.findViewById(R.id.butto);
        b1.setBackgroundColor(getResources().getColor(R.color.white));
        b2.setBackgroundColor(getResources().getColor(R.color.or));
        TextView textViewGreeting = root.findViewById(R.id.textView3);
        String greeting = getGreeting();
        textViewGreeting.setText(greeting);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), connActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }








    private String getGreeting() {
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