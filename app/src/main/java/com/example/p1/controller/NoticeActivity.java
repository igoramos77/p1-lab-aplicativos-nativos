package com.example.p1.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.p1.R;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticecontent);

        TextView title = findViewById(R.id.second_text_view);
        TextView subtitle = findViewById(R.id.subtitle_text);

        Bundle bundle = getIntent().getExtras();
        bundle.getBundle("key");
        bundle.getBundle("subtitle");

        title.setText(bundle.getString("title"));
        subtitle.setText(bundle.getString("subtitle"));
    }
}