package com.example.passdatatoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        SinhVien sinhVien = (SinhVien) getIntent().getSerializableExtra("sinhVien");
        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_age = findViewById(R.id.tv_age);
        TextView tv_school = findViewById(R.id.tv_school);
        TextView tv_class = findViewById(R.id.tv_class);
        Button button = findViewById(R.id.btn_return);

        tv_name.setText(sinhVien.name);
        tv_age.setText(sinhVien.age);
        tv_school.setText(sinhVien.classET);
        tv_class.setText(sinhVien.school);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}