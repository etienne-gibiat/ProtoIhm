package com.example.prototype.Activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.prototype.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnCalendar, btnChat, btnProfile, btnFile, btnSetting;
    CardView btnLogin;
    ImageView btnExit;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnCalendar = findViewById(R.id.calendar);
        btnChat = findViewById(R.id.chat);
        btnProfile = findViewById(R.id.profile);
        btnFile = findViewById(R.id.file);
        btnSetting = findViewById(R.id.setting);
        btnExit = findViewById(R.id.btnExit);
        btnLogin = findViewById(R.id.btnLogin);

        tvLogin =findViewById(R.id.tvLogin);


        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalendarActivity.class));
            }
        });

        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChatActivity.class));
            }
        });

        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StorageActivity.class));
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfilActivity.class));
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvLogin.getText().equals("Connexion")){
                    tvLogin.setText("Deconnexion");
                }else{
                    tvLogin.setText("Connexion");
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}
