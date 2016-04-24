 
package br.com.trabalho1.controller;

import br.com.trabalho1.controller.dao.IAlunoDAO;
import br.com.trabalho1.model.Aluno;
import br.com.trabalho1.model.exceptions.MatriculaInexistenteException;
import br.com.trabalho1.model.exceptions.MatriculaVaziaException;

 
public class AlunoController {
    
    private IAlunoDAO alunoDao;
    
    public AlunoController(IAlunoDAO alunoDao){
        this.alunoDao = alunoDao;
    }
    
    public Aluno buscar(String matricula){
       valida(matricula); 
       Aluno alunoFind = alunoDao.buscaPelaMatricula(Integer.valueOf(matricula));
       if(alunoFind != null){
           return alunoFind;
       }else{
           throw new MatriculaInexistenteException();
       }
    }
    
    public void valida(String matricula){
        if(matricula.equals("")){
            throw new MatriculaVaziaException();
        }
    }
    
}
