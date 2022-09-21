package com.example.passdatatoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.et_name);
        EditText age = findViewById(R.id.et_age);
        EditText school = findViewById(R.id.et_school);
        EditText classET = findViewById(R.id.et_class);
        Button button = findViewById(R.id.btn_add);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ChildActivity.class);
                /*i.putExtra("name", name.getText().toString());
                i.putExtra("age", age.getText().toString());
                i.putExtra("school", school.getText().toString());
                i.putExtra("class", classET.getText().toString());*/
                // create a new class with data
                SinhVien sinhVien = new SinhVien(name.getText().toString(), age.getText().toString(), school.getText().toString(), classET.getText().toString());
                i.putExtra("sinhVien", sinhVien);
                startActivity(i);
            }
        });
    }



}