package com.e.apirestexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ReportService reportService;
    UsersService usersService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// campos y botoncitos
        final EditText title = findViewById(R.id.txt_title);
        final EditText description = findViewById(R.id.txt_description);
        final EditText img = findViewById(R.id.txt_img);
        final Button btn_add = findViewById(R.id.btn_add);


        reportService = Connection.getServiceRemote();
        usersService = Connection.getServiceRemotee();

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Report report = new Report();
                report.setTitle(title.getText().toString());
                report.setDescription(description.getText().toString());
                report.setImage(img.getText().toString());
                addReport(report);
            }
        });
    }


    public void addReport(Report r){
        Call<Report> call = reportService.addReport(r);
        call.enqueue(new Callback<Report>() {
            @Override
            public void onResponse(Call<Report> call, Response<Report> response) {
                System.out.println(response);
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Agregado Correctamente", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Report> call, Throwable t) {
                System.out.println(t.getMessage());
                Log.e("Error: ",t.getMessage());
            }
        });


    }

}
