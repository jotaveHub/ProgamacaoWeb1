package br.edu.ifpb.demo.aluno;

import br.edu.ifpb.demo.Endereco;

public record Aluno(Integer matricula,
                    String nome,
                    String curso,
                    Endereco endereco) {
}