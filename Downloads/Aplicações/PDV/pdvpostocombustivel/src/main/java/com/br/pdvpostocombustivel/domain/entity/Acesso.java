package com.br.pdvpostocombustivel.domain.entity;

public class Acesso{
    //atributos
    private String usuario;
    private String senha;

    //construtor
    public Acesso(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;

    }

    //getter
    public String getUsuario(){
        return usuario;
    }
    public String getSenha(){
        return senha;
    }

    //setter
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
