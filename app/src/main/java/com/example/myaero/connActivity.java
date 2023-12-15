package com.example.myaero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class connActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ViewPagerAdapter adapter;
    //FloatingActionButton facebook,google,twitter;
    float v=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conn);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
       //facebook = findViewById(R.id.fab_facebook);
       //google = findViewById(R.id.fab_google);
       //twitter = findViewById(R.id.fab_twitter);


        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Singup"));
        tabLayout.setTabTextColors(Color.parseColor("#0A22A8"),Color.parseColor("#FFFAA931")) ;
        //tabLayout.setTabTextColors(Color.BLACK, Color.parseColor("#FFA500"));
    //tabTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18); // Ajustez la valeur selon vos besoins


        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new ViewPagerAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });


       // facebook.setTranslationY(300);
     //   google.setTranslationY(300);
       //  twitter.setTranslationY(300);
        //tabLayout.setTranslationY(300);

    //    facebook.setAlpha(v);
      //  google.setAlpha(v);
        //twitter.setAlpha(v);
        tabLayout.setAlpha(v);
    //    facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
      //  google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        //twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();





    }
}