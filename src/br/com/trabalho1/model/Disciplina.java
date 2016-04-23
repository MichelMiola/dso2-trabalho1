
package br.com.trabalho1.model;

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
