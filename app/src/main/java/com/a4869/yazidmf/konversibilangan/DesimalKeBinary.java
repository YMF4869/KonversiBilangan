package com.a4869.yazidmf.konversibilangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class DesimalKeBinary extends AppCompatActivity {
    EditText desi,bin;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desimalkebinary);
        desi = (EditText)findViewById(R.id.desimal);
        bin = (EditText)findViewById(R.id.bin);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputdesimal = Integer.parseInt(desi.getText().toString());
                int i=0, hasil =0;
                int []biner = new int[9];
                String hasilbiner="";
                i = 9;
                while (inputdesimal > 0){
                    hasil = inputdesimal %8;
                    inputdesimal= (inputdesimal - hasil)/8;
                    i--;
                    biner [i]= hasil;
                    hasilbiner = biner[i]+ hasilbiner;

                }
                bin.setText(hasilbiner);
            }
        });
    }
}
