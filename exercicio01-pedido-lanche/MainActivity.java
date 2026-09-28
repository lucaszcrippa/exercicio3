package com.exemplo.pedidolanche;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText etxtLanche = findViewById(R.id.etxtLanche);
        TextInputEditText etxtBebida = findViewById(R.id.etxtBebida);
        TextInputEditText etxtObservacao = findViewById(R.id.etxtObservacao);
        Button btnPedir = findViewById(R.id.btn_Pedir);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnPedir.setOnClickListener(view -> {
            String lanche = etxtLanche.getText().toString();
            String bebida = etxtBebida.getText().toString();
            String observacao = etxtObservacao.getText().toString();

            // Terminal (Logcat)
            System.out.println("Lanche: " + lanche);
            System.out.println("Bebida: " + bebida);
            System.out.println("Observação: " + observacao);

            // Desafio: mostrar na tela
            String mensagem = "Pedido: " + lanche + " + " + bebida + " (" + observacao + ")";
            txtResultado.setText(mensagem);
        });
    }
}
