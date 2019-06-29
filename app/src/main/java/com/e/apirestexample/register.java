package com.e.apirestexample;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Splash);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // campos y botoncitos
        final EditText txt_nombre = findViewById(R.id.txt_nombre);
        final EditText txt_correo = findViewById(R.id.txt_correo);
        final EditText txt_password = findViewById(R.id.txt_password);
        final TextView txt_logearse = findViewById(R.id.txt_logearse);

        txt_logearse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this, login.class);
                startActivity(intent);

            }
        });

    }
}
