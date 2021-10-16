package com.example.basic_ops_ocho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText jetnumero1,jetnumero2;
    TextView jtvsuma,jtvresta,jtvmult,jtvdiv;
    Button jbtops,jbtclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        jetnumero1 = findViewById(R.id.etnumber1);
        jetnumero2 = findViewById(R.id.etnumber2);
        jtvsuma = findViewById(R.id.tvsuma);
        jtvresta = findViewById(R.id.tvresta);
        jtvmult = findViewById(R.id.tvmult);
        jtvdiv = findViewById(R.id.tvdiv);
        jbtops = findViewById(R.id.btops);
        jbtclear = findViewById(R.id.btclear);
    }
}