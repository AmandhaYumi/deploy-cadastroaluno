package br.com.fiap.aluno_cadastro.controller;

import br.com.fiap.aluno_cadastro.model.Aluno;
import br.com.fiap.aluno_cadastro.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*") // Para simplificar caso o front esteja em outro lugar, embora vá ficar no static
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(@Valid @RequestBody Aluno aluno) {
        Aluno salvo = repository.save(aluno);
        return ResponseEntity.ok(salvo);
    }
}
