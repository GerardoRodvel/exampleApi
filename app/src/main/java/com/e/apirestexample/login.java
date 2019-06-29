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

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Splash);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // campos y botoncitos
        final EditText txt_correo = findViewById(R.id.txt_correo);
        final EditText txt_password = findViewById(R.id.txt_password);
        final Button btn_login = findViewById(R.id.btn_login);
        final TextView txt_registrarse = findViewById(R.id.txt_registrarse);



        txt_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);

            }
        });


    }

}
