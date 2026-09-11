package br.edu.ifpb.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @GetMapping("/{matricula}")
    public String listar(
            @PathVariable String matricula,
            @RequestParam(required = false) String curso
    ) {
        if (matricula.equals("123") && (curso == null || curso.equals("ADS"))) {
            return "Aluno listado";
        }
        return "Aluno não encontrado";
    }

    @PostMapping
    public String cadastrar() {
        return "Cadastrar Aluno";
    }
}
