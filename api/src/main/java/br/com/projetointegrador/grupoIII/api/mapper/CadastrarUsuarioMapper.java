package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Usuarios;
import br.com.projetointegrador.grupoIII.api.presentation.request.CadastrarUsuarioRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.CadastrarUsuarioResponse;

public class CadastrarUsuarioMapper {

    public static Usuarios toEntity(CadastrarUsuarioRequest request) {
        return Usuarios.builder()
                .nome(request.getNome())
                .login(request.getLogin())
                .senha(request.getSenha())
                .ativo(request.getAtivo())
                .build();
    }

    public static CadastrarUsuarioResponse toResponse(Integer id) {
        return CadastrarUsuarioResponse.builder()
                .id(id)
                .build();
    }
}
