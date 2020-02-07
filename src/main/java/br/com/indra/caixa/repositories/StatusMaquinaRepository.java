package br.com.indra.caixa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.indra.caixa.models.StatusMaquina;

public interface StatusMaquinaRepository extends JpaRepository<StatusMaquina, Long> {

}
