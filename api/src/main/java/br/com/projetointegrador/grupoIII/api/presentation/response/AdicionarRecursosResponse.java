package br.com.projetointegrador.grupoIII.api.presentation.response;

import br.com.projetointegrador.grupoIII.api.domain.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdicionarRecursosResponse {

    private Integer id;
}
