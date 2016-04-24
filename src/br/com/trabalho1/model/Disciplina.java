package br.com.trabalho1.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private Integer codigo;
    private String nome;
    private List<Horario> horarios = new ArrayList<>();

    public Integer getCodigo() {
        return codigo;
    }

    public Disciplina setCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void addHorario(Horario horario) {
        this.horarios.add(horario);
    }

}
