package com.example.felix_its.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtName, txtAddress, txtPhone;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtPhone = findViewById(R.id.txtPhone);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();

        String name = intent.getStringExtra(MainActivity.NAME);
        String phone = intent.getStringExtra(MainActivity.PHONE);
        String address = intent.getStringExtra(MainActivity.ADDRESS);

        txtName.setText(name);
        txtAddress.setText(address);
        txtPhone.setText(phone);

    }
}
