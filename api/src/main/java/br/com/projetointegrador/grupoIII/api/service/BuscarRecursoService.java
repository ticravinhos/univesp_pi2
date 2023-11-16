package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Recursos;
import br.com.projetointegrador.grupoIII.api.repository.RecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Service
public class BuscarRecursoService {

    @Autowired
    private RecursosRepository recursosRepository;

    public Recursos porId(Integer id) {
        return recursosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(UNPROCESSABLE_ENTITY, "Recurso não encontrado"));
    }
}
