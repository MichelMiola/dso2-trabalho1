/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho1.model;

/**
 *
 * @author 07155422908
 */
public class Disciplina {
    
    private Integer codigo;
    private String nome;
    private Horario horario;

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

    public Horario getHorario() {
        return horario;
    }

    public Disciplina setHorario(Horario horario) {
        this.horario = horario;
        return this;
    }

   
    
    
}
