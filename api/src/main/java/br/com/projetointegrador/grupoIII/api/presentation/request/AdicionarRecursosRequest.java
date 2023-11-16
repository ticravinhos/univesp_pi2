package br.com.projetointegrador.grupoIII.api.presentation.request;

import br.com.projetointegrador.grupoIII.api.domain.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdicionarRecursosRequest {

    private String descricao;
    private String categoria;
    private Double valor;
    private Tipo tipo;
}
