package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.repository.FinanciamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.*;

@Service
public class BuscarFinanciamentoService {

    @Autowired
    private FinanciamentoRepository financiamentoRepository;

    public Financiamento porId(Integer id) {
        return financiamentoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(UNPROCESSABLE_ENTITY, "Financiamento não encontrado!"));
    }
}
