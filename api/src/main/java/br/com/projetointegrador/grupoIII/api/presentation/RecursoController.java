package br.com.projetointegrador.grupoIII.api.presentation;

import br.com.projetointegrador.grupoIII.api.presentation.request.AdicionarRecursosRequest;
import br.com.projetointegrador.grupoIII.api.presentation.response.AdicionarRecursosResponse;
import br.com.projetointegrador.grupoIII.api.presentation.response.ListarRecursosResponse;
//import br.com.projetointegrador.grupoIII.api.security.domain.Funcao;
import br.com.projetointegrador.grupoIII.api.service.*;
//import br.com.projetointegrador.grupoIII.api.service.MensagemPrivadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

//import static br.com.projetointegrador.grupoIII.api.security.domain.Funcao.Nomes.ADMIN;
//import static br.com.projetointegrador.grupoIII.api.security.domain.Funcao.Nomes.USUARIO;

@RestController
@RequestMapping("/recurso")
public class RecursoController {

//    @Autowired
//    private MensagemPrivadaService mensagemPrivadaService;

    @Autowired
    private AdicionarRecursoService adicionarRecursoService;

    @Autowired
    private ListarRecursoService listarRecursoService;

    @Autowired
    private ExcluirRecursoService excluirRecursoService;

//    @GetMapping()
//    public String privado() {
//        return mensagemPrivadaService.gerarMensagem();
//    }

//    @Secured(ADMIN)
    @PostMapping("/adicionar-recurso")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<AdicionarRecursosResponse> adicionarRecursos(@Valid @RequestBody AdicionarRecursosRequest request) {
        AdicionarRecursosResponse response = adicionarRecursoService.adicionarRecursos(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/listar-recursos")
    public ResponseEntity<List<ListarRecursosResponse>> listarRecursos(@RequestParam List<Integer> codigos) {
        List<ListarRecursosResponse> response = listarRecursoService.listarRecursos(codigos);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/excluir-recurso/{id}")
    @ResponseStatus(OK)
    public void excluirRecursos(@PathVariable Integer id) {
        excluirRecursoService.excluirRecursos(id);
    }
}
