package com.example.alarmandtime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView= findViewById(R.id.bottom_nav_view);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                if(id==R.id.menu_item_alarm){
                    loadFrag(new Alarm(),false);
                }
                else if(id==R.id.menu_item_world_clock){
                    loadFrag(new WorldClock(),false);
                }
                else if(id==R.id.menu_item_stopwatch){
                    loadFrag(new Stopwatch(),false);
                }
                else {
                    loadFrag(new Timer(),false);
                }

                return true;
            }
        });
        bnView.setSelectedItemId(R.id.menu_item_alarm);
    }
    public void loadFrag(Fragment fragment , boolean flag ){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag){
            ft.add(R.id.container,fragment);
        }
        else{
            ft.replace(R.id.container,fragment);
        }
        ft.commit();

    }

}