package br.edu.ifpb.demo;

public record Aluno(Integer matricula,
                    String nome,
                    String curso,
                    Endereco endereco) {
}