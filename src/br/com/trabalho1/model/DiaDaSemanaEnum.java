 
package br.com.trabalho1.model;

 
public enum DiaDaSemanaEnum {
     
    SEGUNDA("Segunda", 2), TERCA("Terça", 3), QUARTA("Quarta", 4), QUINTA("Quinta", 5), SEXTA("Sexta", 6);
    
    private final Integer codigo;
    private final String des;
    
    public static DiaDaSemanaEnum getByCodigo(Integer codigo){
        switch(codigo){
            case 2:
                return SEGUNDA;
           case 3:
               return TERCA;
           case 4:
               return QUARTA;
           case 5:
               return QUINTA;
           case 6:
               return SEXTA;
            default:
                return null;
        }
    }
    
    private DiaDaSemanaEnum(String des, Integer codigo){
        this.des =des;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDes() {
        return des;
    }

    @Override
    public String toString() {
       return des;
    }
    
    
   
}
