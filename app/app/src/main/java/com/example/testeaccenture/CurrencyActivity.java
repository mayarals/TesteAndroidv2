package com.example.testeaccenture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {

    private TextView textViewNomeUsuario;
    private TextView textViewNumeroConta;
    private TextView textViewValorSaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        initViews();
    }

    public void initViews(){
        textViewNomeUsuario = findViewById(R.id.txtNomeUsuario);
        textViewNumeroConta = findViewById(R.id.txtNumeroConta);
        textViewValorSaldo = findViewById(R.id.txtValorSaldo);
    }
}
