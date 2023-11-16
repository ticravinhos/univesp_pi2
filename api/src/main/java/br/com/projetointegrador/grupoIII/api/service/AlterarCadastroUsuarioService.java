package br.com.projetointegrador.grupoIII.api.service;

import br.com.projetointegrador.grupoIII.api.domain.Usuarios;
import br.com.projetointegrador.grupoIII.api.mapper.AlterarCadastroUsuarioMapper;
import br.com.projetointegrador.grupoIII.api.presentation.request.AlterarCadastroUsuarioRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AlterarCadastroUsuarioResponse;
import br.com.projetointegrador.grupoIII.api.repository.FinanciamentoRepository;
import br.com.projetointegrador.grupoIII.api.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlterarCadastroUsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private BuscarUsuarioService buscarUsuarioService;

    @Transactional
    public AlterarCadastroUsuarioResponse alterarCadastroUsuario(AlterarCadastroUsuarioRequest request, Integer id) {
        Usuarios usuario = buscarUsuarioService.porId(id);

        Usuarios usuarioAlterado = AlterarCadastroUsuarioMapper.toEntity(request);

        usuario.setNome(usuarioAlterado.getNome());
        usuario.setLogin(usuario.getLogin());
        usuario.setSenha(usuarioAlterado.getSenha());

        usuariosRepository.save(usuario);

        return AlterarCadastroUsuarioMapper.toResponse(usuario);
    }
}
