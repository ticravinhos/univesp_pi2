package br.com.projetointegrador.grupoIII.api.presentation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FinanciamentoResponse {

    private Integer id;
    private String descricao;
    private Integer parcelas;
    private Double valor;
}
