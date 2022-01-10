package com.example.melnikova_v_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film);

    }

    public void onMyButtonClickWeb(View view)
    {
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"));
        startActivity(browserIntent);
    }
}