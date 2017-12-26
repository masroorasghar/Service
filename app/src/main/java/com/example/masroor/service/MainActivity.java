package com.example.masroor.service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public void startClicked(View view) {
        startService(new Intent("SayHello"));
    }

    public void stopClicked(View view) {
        stopService(new Intent("SayHello"));
    }
}
