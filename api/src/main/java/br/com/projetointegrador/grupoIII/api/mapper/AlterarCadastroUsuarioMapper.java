package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Usuarios;
import br.com.projetointegrador.grupoIII.api.presentation.request.AlterarCadastroUsuarioRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AlterarCadastroUsuarioResponse;

public class AlterarCadastroUsuarioMapper {

    public static Usuarios toEntity(AlterarCadastroUsuarioRequest request) {
        return Usuarios.builder()
                .nome(request.getNome())
                .login(request.getNome())
                .senha(request.getSenha())
                .build();
    }

    public static AlterarCadastroUsuarioResponse toResponse(Usuarios response) {
        return AlterarCadastroUsuarioResponse.builder()
                .id(response.getId())
                .nome(response.getNome())
                .login(response.getLogin())
                .build();
    }
}
