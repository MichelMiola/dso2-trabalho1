 
package br.com.trabalho1.model;

 
public class Horario {
    
    private DiaDaSemanaEnum diaDaSemana;
    private Integer hora;
    private Sala sala;

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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }



    @Override
    public String toString() {
        return this.getSala().getLocal()+"-"+this.sala.getNumero();
    }
      
    
    
}
