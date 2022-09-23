package com.example.p1.controller.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.p1.R;
import com.example.p1.model.entity.Notice;

import java.util.List;
import java.util.Locale;

public class NoticeAdapter extends BaseAdapter {
    private List<Notice> noticeList;

    public NoticeAdapter(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }

    @Override
    public int getCount() {
        return this.noticeList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.noticeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.noticeList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardnotice, parent, false);
        }

        Notice news = (Notice) getItem(position);
        TextView textViewTime = convertView.findViewById(R.id.textViewTime);
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewSubTitle = convertView.findViewById(R.id.textViewSubTitle);

        textViewTime.setText(news.getCreated_at().toString());
        textViewTitle.setText(news.getTitle().toUpperCase(Locale.ROOT));
        textViewSubTitle.setText(news.getSubtitle());

        return convertView;
    }

}
