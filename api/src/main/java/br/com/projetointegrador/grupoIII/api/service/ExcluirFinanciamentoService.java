package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.repository.FinanciamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExcluirFinanciamentoService {

    @Autowired
    FinanciamentoRepository financiamentoRepository;

    @Autowired
    private BuscarFinanciamentoService buscarFinanciamentoService;

    @Transactional
    public void excluirFinanciamento(Integer id) {
        Financiamento financiamento = buscarFinanciamentoService.porId(id);

        financiamentoRepository.delete(financiamento);
    }
}
