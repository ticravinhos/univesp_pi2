package br.com.projetointegrador.grupoIII.api.presentation;

import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarFinanciamentoRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarFinanciamentoResponse;
import br.com.projetointegrador.grupoIII.api.presentation.response.FinanciamentoResponse;
//import br.com.projetointegrador.grupoIII.api.security.domain.Funcao;
import br.com.projetointegrador.grupoIII.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

//import static br.com.projetointegrador.grupoIII.api.security.domain.Funcao.Nomes.ADMIN;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/financiamento")
public class FinanciamentoController {

//    @Autowired
//    MensagemPrivadaService mensagemPrivadaService;

    @Autowired
    AdicionarFinanciamentoService adicionarFinanciamentoService;

    @Autowired
    ListarFinanciamentoService listarFinanciamentoService;

    @Autowired
    ExcluirFinanciamentoService excluirFinanciamentoService;

//    @GetMapping()
//    public String privado() {
//        return mensagemPrivadaService.gerarMensagem();
//    }

//    @Secured(ADMIN)
    @PostMapping("/adicionar-financiamento")
    @ResponseStatus(CREATED)
    public ResponseEntity<AdicionarFinanciamentoResponse> adicionarFinanciamento(@Valid @RequestBody AdicionarFinanciamentoRequest request) {
        AdicionarFinanciamentoResponse response = adicionarFinanciamentoService.adicionarFinanciamento(request);
        return ResponseEntity.ok(response);
    }

//    @Secured(ADMIN)
    @GetMapping("/listar-financiamento")
    public ResponseEntity<List<FinanciamentoResponse>> listarFinanciamento() {
        List<FinanciamentoResponse> response = listarFinanciamentoService.listarFinanciamento();
        return ResponseEntity.ok(response);
    }

//    @Secured(ADMIN)
    @DeleteMapping("/excluir-financiamento/{id}")
    @ResponseStatus(OK)
    public void excluirFinanciamento(@PathVariable Integer id) {
        excluirFinanciamentoService.excluirFinanciamento(id);
    }
}
