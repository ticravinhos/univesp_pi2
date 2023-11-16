package br.com.projetointegrador.grupoIII.api.presentation.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AlterarCadastroUsuarioRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String login;

    @NotNull
    private String senha;
}
