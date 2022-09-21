package com.example.oquecomprar.controller.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.oquecomprar.R;
import com.example.oquecomprar.model.entity.CompraItem;

import java.util.List;

public class CompraItemListViewAdapter extends BaseAdapter {

    private List<CompraItem> compraItemList;

    public CompraItemListViewAdapter(List<CompraItem> compraItemList) {
        this.compraItemList = compraItemList;
    }

    @Override
    public int getCount() {
        return this.compraItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.compraItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.compraItemList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.linearlayout, viewGroup, false);
        }

        CompraItem compraItem = (CompraItem) getItem(i);
        TextView textViewNome = view.findViewById(R.id.list_view_compra_item);
        textViewNome.setText(compraItem.getDescricao());
        TextView textViewQuantidade = view.findViewById(R.id.list_view_compra_item);
        textViewQuantidade.setText(compraItem.getQuantidade().toString());

        return view;
    }
}