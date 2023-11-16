package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarFinanciamentoRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarFinanciamentoResponse;

public class AdicionarFinanciamentoMapper {

    public static Financiamento toEntity(AdicionarFinanciamentoRequest request) {
        return Financiamento.builder()
                .descricao(request.getDescricao())
                .parcelas(request.getParcelas())
                .valor(request.getValor())
                .build();
    }

    public static AdicionarFinanciamentoResponse toResponse(Integer id) {
        return AdicionarFinanciamentoResponse.builder()
                .id(id)
                .build();
    }
}
