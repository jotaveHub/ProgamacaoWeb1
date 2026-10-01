package br.edu.ifpb.demo.aluno;

public record Aluno(Integer matricula,
                    String nome,
                    String curso,
                    Endereco endereco) {
}