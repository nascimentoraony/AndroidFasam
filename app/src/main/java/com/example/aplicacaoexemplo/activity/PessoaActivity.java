package com.example.aplicacaoexemplo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aplicacaoexemplo.R;
import com.example.aplicacaoexemplo.debug.DebugActivity;

public class PessoaActivity extends DebugActivity {

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtEmail;
    EditText txtFone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);
    }

    public void Exibir(View view) {
        //ENTRADA
        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtEmail = findViewById(R.id.txtEmail);
        txtFone = findViewById(R.id.txtFone);

        //PROCESSAMENTO
        String nome, sobrenome, email, telefone;
        nome = txtNome.getText().toString();
        sobrenome = txtSobrenome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtFone.getText().toString();

        //SAIDA
        String dados;
        dados = String.format("Os dados informados são: \n%s\n%s\n%s\n%s", nome, sobrenome, email, telefone);

        //EXIBIR DADOS
        Toast.makeText(getApplication(), dados, Toast.LENGTH_LONG).show();
    }
}