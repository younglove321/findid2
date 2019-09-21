package com.e.findid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;


import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //액션바
        getSupportActionBar().setTitle("아이디 찾기"); //액션바 제목
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기

        //spinner부분 (국가번호)
        final String[] data = getResources().getStringArray(R.array.nation);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, data);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        Button submit = (Button) findViewById(R.id.submit_button);
        submit.setClickable(true);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "아이디 찾기 완료", Toast.LENGTH_LONG).show();

                // 액티비티 전환 코드
                Intent intent = new Intent(getApplicationContext(), result.class);
                startActivity(intent);
            }

        });


    }
}
