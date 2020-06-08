package com.wordpress.smartedudotin.www.databindinglearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.wordpress.smartedudotin.www.databindinglearn.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
//        setContentView (R.layout.activity_main);

       ActivityMainBinding activityMainBinding=  DataBindingUtil.setContentView (this, R.layout.activity_main);

//        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate (getLayoutInflater ());
//        setContentView (activityMainBinding.getRoot ());

        activityMainBinding.setYourVariable ("Hello");
    }
}