 
package br.com.trabalho1.model;

 
public class Horario {
    
    private DiaDaSemanaEnum diaDaSemana;
    private Integer hora;

    public DiaDaSemanaEnum getDiaDaSemana() {
        return diaDaSemana;
    }

    public Horario setDiaDaSemana(DiaDaSemanaEnum diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
        return this;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
      
}
