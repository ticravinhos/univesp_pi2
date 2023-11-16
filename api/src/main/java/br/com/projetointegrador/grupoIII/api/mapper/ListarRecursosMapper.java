package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.domain.Recursos;
import br.com.projetointegrador.grupoIII.api.presentation.response.ListarRecursosResponse;

public class ListarRecursosMapper {

    public static ListarRecursosResponse toResponse(Recursos recursos) {
        return ListarRecursosResponse.builder()
                .id(recursos.getId())
                .descricao(recursos.getDescricao())
                .categoria(recursos.getCategoria())
                .valor(recursos.getValor())
                .tipo(recursos.getTipo())
                .build();
    }
}
