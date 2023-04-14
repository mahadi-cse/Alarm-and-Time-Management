package com.example.alarmandtime;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import java.util.Objects;


public class Alarm extends Fragment {

   ImageButton more,add_alrm;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);
        more= view.findViewById(R.id.more_option);
        add_alrm= view.findViewById(R.id.add_alarm);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(requireContext(), v);

                // Inflate the menu resource
                popup.getMenuInflater().inflate(R.menu.user_options, popup.getMenu());

                // Set a click listener for the menu items
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Handle menu item clicks
                        switch (item.getItemId()) {
                            case R.id.edit:
                                // Do something
                                return true;
                            case R.id.sort:
                                // Do something
                                return true;
                            case R.id.settings:
                                // Do something
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                // Show the popup menu
                popup.show();
            }
        });
        add_alrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getActivity(),AlarmSet.class));
            }
        });
        return view ;
    }
}