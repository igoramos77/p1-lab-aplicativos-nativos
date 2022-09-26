package com.example.p1.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.p1.R;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticecontent);

        TextView title = findViewById(R.id.notice_title_text_view);
        TextView subtitle = findViewById(R.id.notice_subtitle_text_view);
        TextView fakeAuthor = findViewById(R.id.notice_fakeauthor_text_view);

        Bundle bundle = getIntent().getExtras();
        bundle.getBundle("key");
        bundle.getBundle("subtitle");

        title.setText(bundle.getString("title"));
        subtitle.setText(bundle.getString("subtitle"));
    }
}