 
package br.com.trabalho1.model;

 
public enum DiaDaSemanaEnum {
     
    SEGUNDA("Segunda", 0), TERCA("Terça", 1), QUARTA("Quarta", 2), QUINTA("Quinta", 3), SEXTA("Sexta", 4);
    
    private final Integer codigo;
    private final String des;
    
    public static DiaDaSemanaEnum getByCodigo(Integer codigo){
        switch(codigo){
            case 0:
                return SEGUNDA;
           case 1:
               return TERCA;
           case 2:
               return QUARTA;
           case 3:
               return QUINTA;
           case 4:
               return SEXTA;
            default:
                return null;
        }
    }
    
    private DiaDaSemanaEnum(String des, Integer codigo){
        this.des = des;
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
