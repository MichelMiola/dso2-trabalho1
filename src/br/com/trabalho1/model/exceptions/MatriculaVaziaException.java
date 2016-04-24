
package br.com.trabalho1.model.exceptions;


public class MatriculaVaziaException extends RuntimeException{

    public MatriculaVaziaException() {
       super("O campo matricula esta vazio");
    }
}
  