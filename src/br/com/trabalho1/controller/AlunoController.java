 
package br.com.trabalho1.controller;

import br.com.trabalho1.controller.dao.IAlunoDAO;
import br.com.trabalho1.model.Aluno;
import br.com.trabalho1.model.exceptions.MatriculaInexistenteException;

 
public class AlunoController {
    
    private IAlunoDAO alunoDao;
    
    public AlunoController(IAlunoDAO alunoDao){
        this.alunoDao = alunoDao;
    }
    
    public Aluno buscar(Integer matricula){
        Aluno alunoFind = alunoDao.buscaPelaMatricula(matricula);
       if(alunoFind != null){
           return alunoFind;
       }else{
           throw new MatriculaInexistenteException();
       }
    }
    
}
