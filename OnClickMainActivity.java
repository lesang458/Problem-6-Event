package com.example.pc.problem6event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etA,etB;
    private TextView tvKetQua;
    private Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA= findViewById(R.id.etA);
        etB= findViewById(R.id.etB);
        tvKetQua = findViewById(R.id.tvKetQua);
    }
    public void Tong(View v){
        int a= Integer.parseInt(etA.getText().toString().trim());
        int b= Integer.parseInt(etB.getText().toString().trim());
        int Tong = a+b;
        tvKetQua.setText(Tong+"");
    }
}
