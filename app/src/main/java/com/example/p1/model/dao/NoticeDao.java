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
            "Conheça o brasileiro de 17 anos que ganhou o Prêmio Internacional de Violino Fritz Kreisler na Áustria",
            "https://s2.glbimg.com/2Qw6_xzZ_Lgsi8GJ3jfg11eUkHI=/0x15:1024x591/1080x608/smart/filters:max_age(3600)/https://i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2022/z/m/FgJn3ASAAqLJepygHvnA/guidoviolinista.jpg",
            "Guido Sant'Anna começou a tocar violino aos 5 anos inspirado por irmão mais velho. Nascido em Parelheiros, ele segue morando na Zona Sul de São Paulo. Há dez meses, ele perdeu uma competição na Rússia após ficar 8 horas preso na imigração.",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Tassio Auad",
            2,
            "2022-09-22 16:00:00",
            "2022-09-22 16:00:00"
        ));
        this.noticeList.add(new Notice(
            2,
            "Título de eleitor on-line ou e-Título: como ter acesso",
            "https://s2.glbimg.com/zHcvWyLUC7fek3qsLs6Xj-Hq7Ok=/0x0:1280x854/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2020/g/e/4QRwG6RAig375K4kqRXw/whatsapp-image-2020-11-15-at-15.19.36-1-.jpeg",
            "TSE disponibiliza versão eletrônica do documento e, para ter acesso, eleitor deve ter um registro na Justiça Eleitoral. Aplicativo será aceito para votar nas eleições de outubro.",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
            "Tassio Auad",
            2,
            "2022-09-22 16:00:00",
            "2022-09-22 16:00:00"
        ));
        this.noticeList.add(new Notice(
                3,
                "Operação na Maré: traficantes fazem live e mostram refém e negociação de rendição",
                "https://s2.glbimg.com/ZcN3lNv7BvKqzXFmpM2jw_x2A90=/0x0:1920x1080/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2022/y/b/kaLEAXS8Aarlp0Q0evEg/bdrj-motoristas.jpeg",
                "Uma operação conjunta das polícias Civil e Militar do RJ no Complexo da Maré, desde as primeiras horas desta segunda-feira (26), teve intensos confrontos.",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
                "Tassio Auad",
                3,
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
