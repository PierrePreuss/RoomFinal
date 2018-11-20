package com.example.preuss.room;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_con) != null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
           fragmentManager.beginTransaction().add(R.id.fragment_con,new HomeFragment()).commit();
        }
    }
}
