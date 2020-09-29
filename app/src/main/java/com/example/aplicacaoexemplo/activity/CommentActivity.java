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

public class CommentActivity extends AppCompatActivity {

    EditText txtCommentId;
    EditText txtCommentNome;
    EditText txtCommentEmail;
    EditText txtCommentBody;
    ListView listViewComment;

    List<HashMap<String, String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
    }

    public void adicionarComment(View view) {

        txtCommentId = findViewById(R.id.txtCommentId);
        txtCommentNome = findViewById(R.id.txtCommentName);
        txtCommentEmail = findViewById(R.id.txtCommentEmail);
        txtCommentBody = findViewById(R.id.txtCommentBody);
        listViewComment = findViewById(R.id.listViewComment);

        String id, nome, email, body;
        id = txtCommentId.getText().toString();
        nome = txtCommentNome.getText().toString();
        email = txtCommentEmail.getText().toString();
        body = txtCommentBody.getText().toString();

        HashMap<String, String> map = new HashMap<>();
        map.put("Id", id);
        map.put("nome", nome);
        map.put("email", email);
        map.put("body", body);

        lista.add(map);

        String[] from = {"Id","nome","email","body"};
        int[] to = {R.id.txtCommentId, R.id.txtCommentName, R.id.txtCommentEmail, R.id.txtCommentBody};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, lista, R.layout.item_post, from, to);


        listViewComment = findViewById(R.id.listViewComment);
        listViewComment.setAdapter(simpleAdapter);

    }

}