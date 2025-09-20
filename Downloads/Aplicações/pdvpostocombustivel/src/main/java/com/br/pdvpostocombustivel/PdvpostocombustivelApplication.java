package com.br.pdvpostocombustivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import com.br.pdvpostocombustivel.domain.entity.Produto;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PdvpostocombustivelApplication.class, args);
		Produto produto1 = new Produto();
		produto1.setNome("Gasolina");

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNomeCompleto("Vasap");
		pessoa1.setCpfCnpj("06271056000167");
		pessoa1.setNumeroCtps(123456789L);


		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNomeCompleto("Vasap");
		pessoa2.setCpfCnpj("06271056000167");
		pessoa2.setNumeroCtps(123456789L);


		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNomeCompleto("Vasap");
		pessoa3.setCpfCnpj("06271056000167");
		pessoa3.setNumeroCtps(123456789L);

		System.out.println("Nome Completo " + pessoa1.getNomeCompleto());
		System.out.println("CPF/CNPJ " + pessoa1.getCpfCnpj());
		System.out.println("Numero CTPS " + pessoa1.getNumeroCtps());
		System.out.println("-----------------------------------------------------");

		System.out.println("Nome Completo " + pessoa2.getNomeCompleto());
		System.out.println("CPF/CNPJ " + pessoa2.getCpfCnpj());
		System.out.println("Numero CTPS " + pessoa2.getNumeroCtps());
		System.out.println("-----------------------------------------------------");

		System.out.println("Nome Completo " + pessoa3.getNomeCompleto());
		System.out.println("CPF/CNPJ " + pessoa3.getCpfCnpj());
		System.out.println("Numero CTPS " + pessoa3.getNumeroCtps());
	}


}
