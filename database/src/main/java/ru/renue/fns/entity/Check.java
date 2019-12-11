package ru.renue.fns.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "CHECK_DATA")
@Table
@Data
public class Check implements Serializable {

    @EmbeddedId
    private CompositeId id;

    @Column(name = "data")
    private String jsonData;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "telegram_user_id")
    private Long telegramUserId;

    @Embeddable
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CompositeId implements Serializable {

        @Column(name = "fn")
        private String fn;

        @Column(name = "fd")
        private String fd;

        @Column(name = "fs")
        private String fs;
    }
}
