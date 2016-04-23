
package br.com.trabalho1.model;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
    
    private Integer matricula;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Integer getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(Integer matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
        return this;
    }

 
    

    
    
    
}
