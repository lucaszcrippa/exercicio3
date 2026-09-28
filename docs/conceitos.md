# Conceitos da atividade

## 1. A tela (activity_main.xml) — exemplo base

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/textInputLayout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="E-mail">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/etxtEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress" />

</com.google.android.material.textfield.TextInputLayout>

<Button
    android:id="@+id/btn_Salvar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Salvar" />
```

## 2. O código (MainActivity.java) — exemplo base

```java
Button botao = findViewById(R.id.btn_Salvar);
TextInputEditText email = findViewById(R.id.etxtEmail);

// Forma 1: classe anônima
botao.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        System.out.println("botão clicado!!!");
    }
});

// Forma 2: lambda (mais curta)
botao.setOnClickListener(view -> {
    String emailUsuario = email.getText().toString();
    System.out.println("Email selecionado: " + emailUsuario);
});
```

### ❓ Por que a mensagem "botão clicado!!!" nunca aparece?

Cada botão guarda **um único listener**. O segundo `setOnClickListener` **substitui** o primeiro.  
Tudo o que o botão deve fazer precisa estar dentro de um só.

## 3. Mostrando na tela (TextView)

```java
TextView resultado = findViewById(R.id.txtResultado);

botao.setOnClickListener(view -> {
    String emailUsuario = email.getText().toString();
    System.out.println("Email: " + emailUsuario);   // terminal
    resultado.setText("Email: " + emailUsuario);    // tela
});
```
