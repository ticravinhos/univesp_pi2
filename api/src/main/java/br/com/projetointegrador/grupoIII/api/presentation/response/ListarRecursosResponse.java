package br.com.projetointegrador.grupoIII.api.presentation.response;

import br.com.projetointegrador.grupoIII.api.domain.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ListarRecursosResponse {

    private Integer id;
    private String descricao;
    private String categoria;
    private Double valor;
    private Tipo tipo;
}
