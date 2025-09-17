package com.br.pdvpostocombustivel.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
    Optional<Pessoa> findByNome(String nome);
    Optional<Pessoa> findByCpfCnpj(String cpfCnpj);
    boolean existsByCpfCnpj(String CpfCnpj);

}
