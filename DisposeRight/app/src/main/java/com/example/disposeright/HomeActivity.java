package com.example.disposeright;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private Button picBtn;
    private Button remindersBtn;
    private Button locationBtn;
    private Button infoBtn;
    private Button contactBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        picBtn = (Button) findViewById(R.id.takePictureBtn);
        remindersBtn = (Button) findViewById(R.id.remindersBtn);
        locationBtn = (Button) findViewById(R.id.locationBtn);
        infoBtn = (Button) findViewById(R.id.infoBtn);
        contactBtn = (Button) findViewById(R.id.conatctBtn);

        picBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, ClassificationActivity.class);
                startActivity(i);
            }
        });

    }

}