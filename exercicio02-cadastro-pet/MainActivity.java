package com.exemplo.cadastropet;

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

        TextInputEditText etxtNomePet = findViewById(R.id.etxtNomePet);
        TextInputEditText etxtEspecie = findViewById(R.id.etxtEspecie);
        TextInputEditText etxtIdadePet = findViewById(R.id.etxtIdadePet);
        Button btnCadastrar = findViewById(R.id.btn_CadastrarPet);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCadastrar.setOnClickListener(view -> {
            String nome = etxtNomePet.getText().toString();
            String especie = etxtEspecie.getText().toString();
            String idade = etxtIdadePet.getText().toString();

            // Terminal (Logcat)
            System.out.println("Nome: " + nome);
            System.out.println("Espécie: " + especie);
            System.out.println("Idade: " + idade + " anos");

            // Desafio: mostrar na tela
            String mensagem = nome + " (" + especie + "), " + idade + " anos, cadastrado com sucesso!";
            txtResultado.setText(mensagem);
        });
    }
}
