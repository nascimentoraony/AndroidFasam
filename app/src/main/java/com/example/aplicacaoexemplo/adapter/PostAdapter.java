package com.example.aplicacaoexemplo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplicacaoexemplo.R;
import com.example.aplicacaoexemplo.model.Post;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private Context context;
    private List<Post> postagens;

    public PostAdapter(Context context, List<Post> postagens){

    }

    @Override
    public int getCount() {
        return this.postagens!=null ? this.postagens.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.postagens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Primeira coisa que precisamos verificar é se o Layout está instanciado. Senão leio a referência do xml para o objeto Java
        if(view==null){
           // view = LayoutInflater.from(context).inflate(R.layout.item_post, viewGroup, attachToRoot.false);
        }
        //Procura o item dentro da Lista para "exibir" no Listview
        Post post = (Post) getItem(i);

        //Criar referência de atributos/objeto java para ser customizada em uma listView.
        TextView txtItemUserId, txtItemTitle, txtItemBody;

        txtItemUserId = view.findViewById(R.id.txtItemUserId);
        txtItemTitle = view.findViewById(R.id.txtItemTitle);
        txtItemBody = view.findViewById(R.id.txtItemBody);

        txtItemUserId.setText(String.valueOf(post.getUserId()));
        txtItemTitle.setText(post.getTitle());
        txtItemBody.setText(post.getBody());

        return view;
    }
}
