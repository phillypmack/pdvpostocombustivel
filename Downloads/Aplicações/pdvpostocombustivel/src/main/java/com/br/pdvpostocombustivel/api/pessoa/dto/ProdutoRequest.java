package com.br.pdvpostocombustivel.api.pessoa.dto;

//para entrada
public record ProdutoRequest(String nome, String referencia, String fornecedor, String categoria, String marca) {
}
