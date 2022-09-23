package com.example.p1.model.dao;

import com.example.p1.model.entity.Notice;

import java.util.ArrayList;
import java.util.List;

public class NoticeDao {
    private List<Notice> noticeList;

    public NoticeDao() {
        this.noticeList = new ArrayList<>();
        this.noticeList.add(new Notice(
            1,
            "Igor Brown forma Egenheiro de Software",
            "https://avatars.githubusercontent.com/u/60680294?v=4",
            "Enfim, Igor se formou.",
            "g1.globo.com",
            "Tassio Auad",
            2,
            "2022-09-22 16:00:00",
            "2022-09-22 16:00:00"
        ));
        this.noticeList.add(new Notice(
            2,
            "Curso Egenharia de Software da Universidade de Vassouras é nota 5 no MEC",
            "https://1.bp.blogspot.com/-ZK4BW0x9Chk/XSIkJApXH4I/AAAAAAAAP_Y/U-dwFWn6uKwEfpSmb161JJjsxaopz-1-wCLcBGAs/s1600/117925037679832.jpg",
            "Nota 5 no MEC.",
            "g1.globo.com",
            "Tassio Auad",
            2,
            "2022-09-22 16:00:00",
            "2022-09-22 16:00:00"
        ));
    }

    public List<Notice> getAllNotices() {
        return this.noticeList;
    }

    public Notice getNoticeById(int id){

        for (Notice notice : this.noticeList) {
            if(notice.getId() == id) {
                return notice;
            }
        }
        return null;
    }
}
