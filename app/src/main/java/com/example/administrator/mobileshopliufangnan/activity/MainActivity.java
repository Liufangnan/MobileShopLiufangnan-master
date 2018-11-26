package com.example.administrator.mobileshopliufangnan.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.mobileshopliufangnan.Fragment.NavigationFragment;
import com.example.administrator.mobileshopliufangnan.R;

public class MainActivity extends AppCompatActivity {
    private NavigationFragment navigationFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationFragment = new NavigationFragment();
        FragmentTransaction fragmentionTransaction = getSupportFragmentManager().beginTransaction();
        fragmentionTransaction.add(R.id.main_frame,navigationFragment).commit();
    }
}
