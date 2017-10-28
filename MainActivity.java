package com.example.cgonz.barbell2;

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

        Button settings = (Button)findViewById(R.id.UserSettings);
        Button Logging = (Button) findViewById(R.id.Logging);
        Button progress = (Button) findViewById(R.id.Progress);
        Button Inputs = (Button) findViewById(R.id.Inputs);
       // s'tr//ingjkloph
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(
                        MainActivity.this,
                        Settings_page.class);
                startActivity(i);
            }
        });
        Logging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(
                        MainActivity.this,
                        Logging_Info.class);
                startActivity(i);
            }
        });
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(
                        MainActivity.this,
                        User_Progress.class);
                startActivity(i);
            }
        });
        Inputs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(
                        MainActivity.this,
                        User_Inputs.class);
                startActivity(i);
            }
        });
    }
}
