package br.com.projetointegrador.grupoIII.api.repository;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanciamentoRepository extends JpaRepository<Financiamento, Integer> {
}
