package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Usuarios;
import br.com.projetointegrador.grupoIII.api.presentation.request.CadastrarUsuarioRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.CadastrarUsuarioResponse;
import br.com.projetointegrador.grupoIII.api.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static br.com.projetointegrador.grupoIII.api.mapper.CadastrarUsuarioMapper.toEntity;
import static br.com.projetointegrador.grupoIII.api.mapper.CadastrarUsuarioMapper.toResponse;

@Service
public class CadastrarUsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Transactional
    public CadastrarUsuarioResponse cadastrarUsuario(CadastrarUsuarioRequest request) {

        Usuarios usuarios = toEntity(request);

        usuariosRepository.save(usuarios);

        return toResponse(usuarios.getId());
    }
}
