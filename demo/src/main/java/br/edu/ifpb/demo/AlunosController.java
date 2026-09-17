package br.edu.ifpb.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    private ArrayList<Aluno> alunos;
    public AlunosController() {
        alunos = new ArrayList<>();
    }

    @GetMapping(path = "/{matricula}")
    public ResponseEntity<Aluno> listar(
            @PathVariable String matricula,
            @RequestParam(required = false) String curso
    ) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula().toString().equals(matricula)) {
                return ResponseEntity.ok().body(aluno);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(
            @RequestBody Aluno aluno){
        alunos.add(aluno);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(aluno);
    }
    @PostMapping("/form")
    public ResponseEntity<Aluno> cadastrarForm(@ModelAttribute Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(aluno);
        }
    }
