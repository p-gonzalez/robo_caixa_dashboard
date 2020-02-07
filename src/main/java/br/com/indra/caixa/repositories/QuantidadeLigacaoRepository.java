package br.com.indra.caixa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.indra.caixa.models.QuantidadeLigacao;

@Repository
public interface QuantidadeLigacaoRepository extends JpaRepository<QuantidadeLigacao, Long> {

}
