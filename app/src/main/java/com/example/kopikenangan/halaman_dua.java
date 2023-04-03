package com.example.kopikenangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class halaman_dua extends AppCompatActivity {
public LinearLayout finis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dua2);
        finis = findViewById(R.id.berhasil);
        finis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),FinishActivity2.class);
                startActivity(itn);
                finish();
            }
        });
    }
}