package com.example.p1.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.p1.R;
import com.example.p1.controller.adapters.NoticeAdapter;
import com.example.p1.model.dao.NoticeDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        NoticeDao newsDao = new NoticeDao();

        ListView listView = findViewById(R.id.listViewNewsCard);
        listView.setAdapter(new NoticeAdapter(newsDao.getAllNotices()));
    }
}