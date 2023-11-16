package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.presentation.response.FinanciamentoResponse;

public class ListarFinanciamentoMapper {

    public static FinanciamentoResponse toResponse(Financiamento financiamento) {
        return FinanciamentoResponse.builder()
                .id(financiamento.getId())
                .descricao(financiamento.getDescricao())
                .parcelas(financiamento.getParcelas())
                .valor(financiamento.getValor())
                .build();
    }
}
