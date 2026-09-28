package com.exemplo.cadastroproduto;

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

        TextInputEditText etxtProduto = findViewById(R.id.etxtProduto);
        TextInputEditText etxtPreco = findViewById(R.id.etxtPreco);
        TextInputEditText etxtQuantidade = findViewById(R.id.etxtQuantidade);
        Button btnCadastrar = findViewById(R.id.btn_Cadastrar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCadastrar.setOnClickListener(view -> {
            String produto = etxtProduto.getText().toString();
            String precoStr = etxtPreco.getText().toString();
            String quantidadeStr = etxtQuantidade.getText().toString();

            // Terminal (Logcat)
            System.out.println("Produto: " + produto);
            System.out.println("Preço: R$ " + precoStr);
            System.out.println("Quantidade: " + quantidadeStr);

            // Regra extra: preço maior que zero
            try {
                double preco = Double.parseDouble(precoStr);
                int quantidade = Integer.parseInt(quantidadeStr);

                if (preco <= 0) {
                    String msg = "Preço inválido!";
                    System.out.println(msg);
                    txtResultado.setText(msg);
                } else {
                    System.out.println("Produto cadastrado!");
                    double valorEstoque = preco * quantidade;
                    // Desafio: mostrar na tela
                    String mensagem = produto + " cadastrado! Valor em estoque: R$ " + valorEstoque;
                    txtResultado.setText(mensagem);
                }
            } catch (NumberFormatException e) {
                String msg = "Preço inválido!";
                System.out.println(msg);
                txtResultado.setText(msg);
            }
        });
    }
}
