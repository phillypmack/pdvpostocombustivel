package com.br.pdvpostocombustivel.domain.entity;

public class Contato {
    //atribustos
    private String telefone;
    private String email;
    private String endereco;

    //construtor
    public Contato(String telefone, String email, String endereco){
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    //getter

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    public String getEndereco(){
        return endereco;
    }

    //setter

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereco(String endereco){

    }
}
