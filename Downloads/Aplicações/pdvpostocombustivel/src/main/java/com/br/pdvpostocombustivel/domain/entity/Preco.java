package com.br.pdvpostocombustivel.domain.entity;
import jakarta.persistence.*;
import javax.xml.crypto.Data;
import java.math.BigDecimal;

public class Preco {
    private BigDecimal valor;
    private Data dataAlteracao;
    private Data horaAlteracao;
}
