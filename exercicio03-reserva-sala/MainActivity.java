package com.exemplo.reservasala;

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

        TextInputEditText etxtNome = findViewById(R.id.etxtNome);
        TextInputEditText etxtSala = findViewById(R.id.etxtSala);
        TextInputEditText etxtHorario = findViewById(R.id.etxtHorario);
        Button btnReservar = findViewById(R.id.btn_Reservar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnReservar.setOnClickListener(view -> {
            String nome = etxtNome.getText().toString();
            String sala = etxtSala.getText().toString();
            String horario = etxtHorario.getText().toString();

            // Terminal (Logcat)
            System.out.println("Responsável: " + nome);
            System.out.println("Sala: " + sala);
            System.out.println("Horário: " + horario);

            // Desafio: mostrar na tela
            String mensagem = sala + " reservado para " + nome + " às " + horario;
            txtResultado.setText(mensagem);
        });
    }
}
