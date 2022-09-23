package com.example.p1.model.entity;

import java.util.Date;

public class Notice {
    private int id;
    private String title;
    private String poster_url;
    private String subtitle;
    private String content;
    private String author;
    private int reading_time;
    private String created_at;
    private String updated_at;

    public Notice(int id, String title, String poster_url, String subtitle, String content, String author, int reading_time, String created_at, String updated_at) {
        this.id = id;
        this.title = title;
        this.poster_url = poster_url;
        this.subtitle = subtitle;
        this.content = content;
        this.author = author;
        this.reading_time = reading_time;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReading_time() {
        return reading_time;
    }

    public void setReading_time(int reading_time) {
        this.reading_time = reading_time;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
