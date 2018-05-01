package com.example.arman.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent = getIntent();
    }

    public void nextView(View view) {
        Intent intent = new Intent(this, Cleaness.class);
        startActivity(intent);


    }


    public void lastView(View view) {
        Intent intent = new Intent(this, EntrevistadoProfile.class);
        startActivity(intent);
    }
}
