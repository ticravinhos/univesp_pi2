package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarFinanciamentoRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarFinanciamentoResponse;
import br.com.projetointegrador.grupoIII.api.repository.FinanciamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.projetointegrador.grupoIII.api.mapper.AdicionarFinanciamentoMapper.toEntity;
import static br.com.projetointegrador.grupoIII.api.mapper.AdicionarFinanciamentoMapper.toResponse;

@Service
public class AdicionarFinanciamentoService {

    @Autowired
    private FinanciamentoRepository financiamentoRepository;


    public AdicionarFinanciamentoResponse adicionarFinanciamento(AdicionarFinanciamentoRequest request) {

        Financiamento financiamento = toEntity(request);

        financiamentoRepository.save(financiamento);

        return toResponse(financiamento.getId());
    }
}
