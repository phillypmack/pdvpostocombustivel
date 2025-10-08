package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "produto_id", unique = true, nullable = false)
    private Produto produto;

    @Column(nullable = false, precision = 10, scale = 3)
    private BigDecimal quantidade;

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    @Column(name = "local_tanque", length = 100)
    private String localTanque;

    @Column(name = "local_endereco", length = 200)
    private String localEndereco;

    @Column(name = "lote_fabricacao", length = 100)
    private String loteFabricacao;

    /** Construtor JPA */
    protected Estoque() {}

    public Estoque(Produto produto, BigDecimal quantidade, LocalDate dataValidade, String localTanque, String localEndereco, String loteFabricacao) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.localTanque = localTanque;
        this.localEndereco = localEndereco;
        this.loteFabricacao = loteFabricacao;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLocalTanque() {
        return localTanque;
    }

    public void setLocalTanque(String localTanque) {
        this.localTanque = localTanque;
    }

    public String getLocalEndereco() {
        return localEndereco;
    }

    public void setLocalEndereco(String localEndereco) {
        this.localEndereco = localEndereco;
    }

    public String getLoteFabricacao() {
        return loteFabricacao;
    }

    public void setLoteFabricacao(String loteFabricacao) {
        this.loteFabricacao = loteFabricacao;
    }
}
