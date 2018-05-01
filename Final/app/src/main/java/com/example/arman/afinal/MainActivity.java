package com.example.arman.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button acept = (Button)findViewById(R.id.acepto);
        Button noAcept = (Button)findViewById(R.id.noacepto);
    }



    public void nextView(View view) {
        Intent intent = new Intent(this, EntrevistadoProfile.class);
        startActivity(intent);
    }
}
