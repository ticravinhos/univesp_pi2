package br.com.projetointegrador.grupoIII.api.presentation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AlterarCadastroUsuarioResponse {

    private Integer id;
    private String nome;
    private String login;
}
