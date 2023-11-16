package br.com.projetointegrador.grupoIII.api.mapper;

import br.com.projetointegrador.grupoIII.api.domain.Financiamento;
import br.com.projetointegrador.grupoIII.api.domain.Recursos;
import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarRecursosRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarRecursosResponse;

public class AdicionarRecursosMapper {

    public static Recursos toEntity(AdicionarRecursosRequest request){
        return Recursos.builder()
                .descricao(request.getDescricao())
                .categoria(request.getCategoria())
                .valor(request.getValor())
                .tipo(request.getTipo())
                .build();
    }

    public static AdicionarRecursosResponse toResponse(Integer id) {
        return AdicionarRecursosResponse.builder()
                .id(id)
                .build();
    }
}
