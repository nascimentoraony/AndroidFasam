package com.example.aplicacaoexemplo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.aplicacaoexemplo.R;
import com.example.aplicacaoexemplo.debug.DebugActivity;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {
        //Pegar a opção da tela passada por parâmetro
        int opcao = view.getId();
        Intent intent = null;

        switch (opcao){
            case R.id.btnAddress:
                intent = new Intent(this,AddressActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPessoa:
                intent = new Intent(this,PessoaActivity.class);
                startActivity(intent);
                break;
            case R.id.btnUser:
                intent = new Intent(this,UserActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPost:
                intent = new Intent(this,PostActivity.class);
                startActivity(intent);
                break;
            case R.id.btnComment:
                intent = new Intent(this,CommentActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "Opção Inválida", Toast.LENGTH_LONG).show();
        }
    }
}