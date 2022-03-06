package com.example.philips.devweek.Entity;

import javax.persistence.*;

@Entity //coluna no banco de dados
public class IncidenciaExame {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer Regiao_id;
    private Integer Mes;
    private Long Faixa_id;
    private Integer Qnt_exames;

    public IncidenciaExame(){
    }

    public IncidenciaExame(Integer regiaoid, Integer mes, Long faixaid, Integer qntexames){
        this.Regiao_id = regiaoid;
        this.Mes = mes;
        this.Faixa_id = faixaid;
        this.Faixa_id = faixaid;
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiao_id() {
        return Regiao_id;
    }

    public void setRegiao_id(Integer regiao_id) {
        Regiao_id = regiao_id;
    }

    public Integer getMes() {
        return Mes;
    }

    public void setMes(Integer mes) {
        Mes = mes;
    }

    public Long getFaixa_id() {
        return Faixa_id;
    }

    public void setFaixa_id(Long faixa_id) {
        Faixa_id = faixa_id;
    }

    public Integer getQnt_exames() {
        return Qnt_exames;
    }

    public void setQnt_exames(Integer qnt_exames) {
        Qnt_exames = qnt_exames;
    }
}
