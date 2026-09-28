package com.exemplo.telalogin;

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

        TextInputEditText etxtEmail = findViewById(R.id.etxtEmail);
        TextInputEditText etxtSenha = findViewById(R.id.etxtSenha);
        Button btnEntrar = findViewById(R.id.btn_Entrar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnEntrar.setOnClickListener(view -> {
            String email = etxtEmail.getText().toString();
            String senha = etxtSenha.getText().toString();

            // Terminal (Logcat)
            System.out.println("E-mail digitado: " + email);
            System.out.println("Senha com " + senha.length() + " caracteres");

            // Regra extra: senha com no mínimo 6 caracteres
            if (senha.length() < 6) {
                String msg = "Senha muito curta! Mínimo 6 caracteres.";
                System.out.println(msg);
                txtResultado.setText(msg);
            } else {
                String msg = "Login realizado: " + email + ".";
                System.out.println(msg);
                // Desafio: mostrar na tela
                txtResultado.setText("Bem-vindo(a), " + email + "!");
            }
        });
    }
}
