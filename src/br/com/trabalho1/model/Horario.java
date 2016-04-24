 
package br.com.trabalho1.model;

 
public class Horario {
    
    private DiaDaSemanaEnum diaDaSemana;
    private Integer codigo;

    public DiaDaSemanaEnum getDiaDaSemana() {
        return diaDaSemana;
    }

    public Horario setDiaDaSemana(DiaDaSemanaEnum diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
        return this;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Horario setCodigo(Integer hora) {
        this.codigo = hora;
        return this;
    }
      
}
