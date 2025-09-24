package com.br.pdvpostocombustivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// OpenAPI / Swagger
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "PDV Posto Combustível API",
				version = "v1",
				description = "API de exemplo com CRUD de Pessoas (Spring Boot 3 / Java 17).",
				contact = @Contact(name = "Prof. Esp. Ednilton Rauh", email = "ednilton@example.com"),
				license = @License(name = "MIT")
		),
		servers = {
				@Server(url = "http://localhost:8080", description = "Ambiente Local")
		}
)
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdvpostocombustivelApplication.class, args);

		// Seu bloco de testes antigos pode ficar comentado aqui se quiser.
		// Como estamos usando Swagger, os testes podem ser feitos pela UI:
		// http://localhost:8080/swagger-ui.html
	}
}

/*package com.br.pdvpostocombustivel;

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


}*/
