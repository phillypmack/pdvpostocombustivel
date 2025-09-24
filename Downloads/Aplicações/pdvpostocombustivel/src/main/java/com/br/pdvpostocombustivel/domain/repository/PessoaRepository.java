package com.br.pdvpostocombustivel.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Optional<Pessoa> findByNomeCompleto(String nomeCompleto);
    Optional<Pessoa> findByCpfCnpj(String cpfCnpj);
    boolean existsByCpfCnpj(String CpfCnpj);
    boolean existisByNomeCompleto(String nomeCompleto);


}
