package com.example.aplicacaoexemplo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.aplicacaoexemplo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostActivity extends AppCompatActivity {


    EditText txtUserId;
    EditText txtTitle;
    EditText txtBody;
    ListView listViewPost;

    List<HashMap<String, String>> lista = new ArrayList<>(); //Lista de dados enviadas pelo usuário -- Linhas de uma "MATRIZ"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void adicionarPost(View view) {

        //ENTRADA
        txtUserId = findViewById(R.id.txtUserId);
        txtTitle = findViewById(R.id.txtTitle);
        txtBody = findViewById(R.id.txtBody);
        //PROCESAMENTO
        String userId, title, body;
        userId = txtUserId.getText().toString();
        title = txtTitle.getText().toString();
        body = txtBody.getText().toString();

        /*Iniciando os trabalhos do Simple Adapter
        SimpleAdapter precisa de um List<? extends Map<String,?>>

        List<String> bla = new ArrayList<>(); //List Trabalha com índice numerico

        HashMap<String, String, String> map = new HashMap<>(); //HashMap trabaha com índice Associativo, geralmente
        */

        HashMap<String, String> map = new HashMap<>(); // Armazena as informações do usuário num mapa de Valores --Colunas de uma "MATRIZ"
        map.put("userId", userId); //Apelidos das colunas e conteúdo a ser inserido em cada célula
        map.put("title", title);
        map.put("body", body);

        lista.add(map);

        //Mapear o Layout do Tipo ITEM com os dados contidos dentro do List<HashMap<String,String>>


        //SAIDA
        String[] from = {"userId","title","body"}; // chaves do MAP
        int[] to = {R.id.txtUserId, R.id.txtTitle, R.id.txtBody}; //ids do Layout do titpo Item

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, lista, R.layout.item_post, from, to);

        //Procurar a Referencia da ListView para que ela possa imprimir os dados usando o Padrão Adapter.
        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(simpleAdapter);

    }
}