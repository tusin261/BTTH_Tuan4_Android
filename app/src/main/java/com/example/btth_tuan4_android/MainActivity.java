package com.example.btth_tuan4_android;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SendingData {
    private TextView tvTT;
    private TextView tvThanhTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTT = findViewById(R.id.tvTT);
        tvThanhTien = findViewById(R.id.tvThanhTien);
    }

    @Override
    public void send(String data) {
        tvTT.setText(data);
        tvThanhTien.setText(data);
    }
}