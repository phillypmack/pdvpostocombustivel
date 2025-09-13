package com.br.pdvpostocombustivel.domain.entity;

import java.math.BigDecimal;
import java.util.Date;


public class Estoque {

    private Date dataValidade;
    private BigDecimal quantidade;
    private String localTanque;
    private String localEndereco;
    private String loteFabricacao;

    //construtor
    public Estoque(BigDecimal quantidade,
                   String localTanque,
                   String localEndereco,
                   String loteFabricacao,
                   Date dataValidade){
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
        this.localTanque = localTanque;
        this.localEndereco = localEndereco;
        this.loteFabricacao = loteFabricacao;


    }

    //getter
    public Date getDataValidade() {return dataValidade; }
    public BigDecimal getQuantidade() {return quantidade; }
    public String getLocalTanque() {return localTanque; }
    public String getLocalEndereco() {return localEndereco; }
    public String getLoteFabricacao() {return loteFabricacao; }


    //setter

    public void setDataValidade(Date dataValidade) {this.dataValidade = dataValidade;}
    public void setQuantidade(BigDecimal quantiade) {this.quantidade = quantidade;}
    public void setLocalTanque() {this.localTanque = localTanque;}
    public void setLocalEndereco() {this.localEndereco = localEndereco;}
    public void setLoteFabricacao() {this.loteFabricacao = loteFabricacao;}

}
