package com.example.melnikova_v_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }

    public void onMyButtonClick(View view)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}