package com.roop.AgriKisaan;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyFragmentsActivity extends AppCompatActivity {

    /*UpperFragment upperFragment;
    LowerFragment lowerFragment;*/
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    ThirdFragment thirdFragment;
    FourthFragment fourthFragment;
    FragmentManager fragmentManager;

    void initViews(){

//        upperFragment = new UpperFragment();
//        lowerFragment = new LowerFragment();
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        fourthFragment = new FourthFragment();


//        firstFragment.registerMyListener(secondFragment);




        // FragmentManager will help to manage fragments in Activity
        // eg: to add/delete/update fragment in Activity
        fragmentManager = getSupportFragmentManager();

//        fragmentManager.beginTransaction().add(R.id.upperFrame,upperFragment).commit();
//        fragmentManager.beginTransaction().add(R.id.lowerFrame,lowerFragment).commit();
//        fragmentManager.beginTransaction().add(R.id.lowerFrame,lowerFragment).commit();

        fragmentManager.beginTransaction().add(R.id.FirstFrame,firstFragment).commit();
        fragmentManager.beginTransaction().add(R.id.SecondFrame,secondFragment).commit();
        fragmentManager.beginTransaction().add(R.id.ThirdFrame,thirdFragment).commit();
        fragmentManager.beginTransaction().add(R.id.FourthFrame,fourthFragment).commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fragments);
        initViews();
    }
}

