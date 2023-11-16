package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Recursos;
import br.com.projetointegrador.grupoIII.api.domain.Usuarios;
import br.com.projetointegrador.grupoIII.api.repository.RecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExcluirRecursoService {

    @Autowired
    private RecursosRepository recursosRepository;

    @Autowired
    private BuscarRecursoService buscarRecursoService;

    @Transactional
    public void excluirRecursos(Integer id) {
        Recursos recursos = buscarRecursoService.porId(id);
        recursosRepository.delete(recursos);
    }
}
