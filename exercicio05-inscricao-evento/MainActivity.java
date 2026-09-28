package com.exemplo.inscricaoevento;

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
        TextInputEditText etxtEmail = findViewById(R.id.etxtEmail);
        TextInputEditText etxtIdade = findViewById(R.id.etxtIdade);
        Button btnInscrever = findViewById(R.id.btn_Inscrever);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnInscrever.setOnClickListener(view -> {
            String nome = etxtNome.getText().toString();
            String email = etxtEmail.getText().toString();
            String idadeStr = etxtIdade.getText().toString();

            // Terminal (Logcat)
            System.out.println("Nome: " + nome);
            System.out.println("E-mail: " + email);
            System.out.println("Idade: " + idadeStr);

            // Regra extra: idade entre 14 e 99
            try {
                int idade = Integer.parseInt(idadeStr);
                if (idade < 14 || idade > 99) {
                    String msg = "Idade inválida para o evento.";
                    System.out.println(msg);
                    txtResultado.setText(msg);
                } else {
                    System.out.println("Inscrição confirmada!");
                    // Desafio: mostrar na tela
                    txtResultado.setText(nome + ", sua inscrição foi confirmada!");
                }
            } catch (NumberFormatException e) {
                String msg = "Idade inválida para o evento.";
                System.out.println(msg);
                txtResultado.setText(msg);
            }
        });
    }
}
