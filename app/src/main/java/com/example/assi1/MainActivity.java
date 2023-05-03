package com.example.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s1= findViewById(R.id.sp1);
        ArrayAdapter <CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Units,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);

        Spinner s2= findViewById(R.id.sp2);
        ArrayAdapter <CharSequence> adapter1= ArrayAdapter.createFromResource(this,R.array.Units,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter1);

    }
}