package com.example.disposeright;

import android.content.Intent;
import android.net.Uri;
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

        remindersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://servicesenligne2.ville.montreal.qc.ca/sel/infocollectes/"));
                startActivity(intent);
            }
        });

        locationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ville.montreal.qc.ca/portal/page?_pageid=7237,80535592&_dad=portal&_schema=PORTAL"));
                startActivity(intent);
            }
        });
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, InfoActivity.class);
                startActivity(i);
            }
        });
        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/Rasha7695/DisposeRight"));
                startActivity(intent);
            }
        });
    }

}