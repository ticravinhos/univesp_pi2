package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.mapper.ListarRecursosMapper;
import br.com.projetointegrador.grupoIII.api.presentation.response.ListarRecursosResponse;
import br.com.projetointegrador.grupoIII.api.repository.RecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarRecursoService {

    @Autowired
    private RecursosRepository recursosRepository;

    public List<ListarRecursosResponse> listarRecursos(List<Integer> codigos) {
        return recursosRepository.findAllById(codigos).stream()
                .map(ListarRecursosMapper::toResponse)
                .collect(Collectors.toList());
    }
}
