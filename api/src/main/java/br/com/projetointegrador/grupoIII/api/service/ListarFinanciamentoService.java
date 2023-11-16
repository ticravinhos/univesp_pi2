package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.mapper.ListarFinanciamentoMapper;
import br.com.projetointegrador.grupoIII.api.presentation.response.FinanciamentoResponse;
import br.com.projetointegrador.grupoIII.api.repository.FinanciamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ListarFinanciamentoService {

    @Autowired
    private FinanciamentoRepository financiamentoRepository;

    public List<FinanciamentoResponse> listarFinanciamento() {
        return financiamentoRepository.findAll().stream()
                .map(ListarFinanciamentoMapper::toResponse)
                .collect(toList());
    }

    public List<FinanciamentoResponse> listarFornecedoresPorCodigo(List<Integer> codigos) {
        return financiamentoRepository.findAllById(codigos).stream()
                .map(ListarFinanciamentoMapper::toResponse)
                .collect(toList());
    }
}
