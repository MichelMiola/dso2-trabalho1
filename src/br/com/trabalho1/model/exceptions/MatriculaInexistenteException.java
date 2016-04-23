
package br.com.trabalho1.model.exceptions;

public class MatriculaInexistenteException extends RuntimeException{

    public MatriculaInexistenteException() {
        super("Não foi possivel encontrar esse número de matricula");
    }
    
}
