package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Recursos;
import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarRecursosRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarRecursosResponse;
import br.com.projetointegrador.grupoIII.api.repository.RecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.projetointegrador.grupoIII.api.mapper.AdicionarRecursosMapper.toEntity;
import static br.com.projetointegrador.grupoIII.api.mapper.AdicionarRecursosMapper.toResponse;

@Service
public class AdicionarRecursoService {

    @Autowired
    private RecursosRepository recursosRepository;

    public AdicionarRecursosResponse adicionarRecursos(AdicionarRecursosRequest request) {

        Recursos recursos = toEntity(request);

        recursosRepository.save(recursos);

        return toResponse(recursos.getId());
    }
}
