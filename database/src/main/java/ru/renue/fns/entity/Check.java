package ru.renue.fns.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CHECK")
@Data
public class Check {

    @EmbeddedId
    private CompositeId id;

    @Column(name = "data")
    private String jsonData;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "user_id")
    private Long userId;

    @Embeddable
    @Data
    public static class CompositeId {

        @Column(name = "fn")
        private String fn;

        @Column(name = "fd")
        private String fd;

        @Column(name = "fs")
        private String fs;
    }
}
