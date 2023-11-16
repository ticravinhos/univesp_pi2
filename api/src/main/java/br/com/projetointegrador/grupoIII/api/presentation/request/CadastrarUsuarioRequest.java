package br.com.projetointegrador.grupoIII.api.presentation.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CadastrarUsuarioRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    private Boolean ativo;

}
