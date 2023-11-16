package br.com.projetointegrador.grupoIII.api.presentation.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdicionarFinanciamentoRequest {

    @NotBlank
    private String descricao;

    @NotBlank
    private Integer parcelas;

    @NotBlank
    private Double valor;
}
