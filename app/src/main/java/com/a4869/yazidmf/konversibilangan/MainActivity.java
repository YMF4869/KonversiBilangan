package com.a4869.yazidmf.konversibilangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_dkb(View view) {
        Intent dkb = new Intent(MainActivity.this, DesimalKeBinary.class);
        startActivity(dkb);
    }
    public void btn_tng(View view) {
        Intent tng = new Intent(MainActivity.this, Tentang.class);
        startActivity(tng);
    }

}
