package com.example.philips.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regiao;
    private Integer total_exames;

    public Regiao(String regiao, Integer total) {
        this.regiao = regiao;
        this.total_exames = total;
    }

    public Regiao() {}

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getTotal() {
        return total_exames;
    }

    public void setTotal(Integer total) {
        this.total_exames = total;
    }
}
