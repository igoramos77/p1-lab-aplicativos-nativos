package com.example.oquecomprar.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import androidx.annotation.Nullable;

import com.example.p1.R;
import com.example.oquecomprar.controller.adapter.CompraItemListViewAdapter;
import com.example.oquecomprar.model.entity.CompraItem;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

        List<CompraItem> compraItemList = new ArrayList<>();
        compraItemList.add(new CompraItem(1, "Pão de forma", 1));
        compraItemList.add(new CompraItem(2, "Água de coco", 2));
        compraItemList.add(new CompraItem(3, "Cadeira Executiva", 1));

        CompraItemListViewAdapter adapter = new CompraItemListViewAdapter(compraItemList);

        ListView listViewCompraItem = findViewById(R.id.list_view_compra_item);
        listViewCompraItem.setAdapter(adapter);

    }
}