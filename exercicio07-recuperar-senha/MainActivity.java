package com.exemplo.recuperarsenha;

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
        TextInputEditText etxtConfirmarEmail = findViewById(R.id.etxtConfirmarEmail);
        Button btnRecuperar = findViewById(R.id.btn_Recuperar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnRecuperar.setOnClickListener(view -> {
            String email = etxtEmail.getText().toString();
            String confirmacao = etxtConfirmarEmail.getText().toString();

            // Terminal (Logcat)
            System.out.println("E-mail: " + email);
            System.out.println("Confirmação: " + confirmacao);

            // Regra extra: os dois e-mails precisam ser iguais
            if (email.equals(confirmacao)) {
                String msg = "Link enviado para " + email + ".";
                System.out.println(msg);
                // Desafio: mesma mensagem na tela
                txtResultado.setText(msg);
            } else {
                String msg = "Os e-mails não conferem!";
                System.out.println(msg);
                txtResultado.setText(msg);
            }
        });
    }
}
