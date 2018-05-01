package com.example.arman.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntrevistadoProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrevistado_profile);
        Intent intent = getIntent();

        Button btn = (Button)findViewById(R.id.continue2);

    }

    public void nextView(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
