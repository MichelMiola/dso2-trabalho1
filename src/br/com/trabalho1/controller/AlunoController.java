 
package br.com.trabalho1.controller;

import br.com.trabalho1.controller.dao.IAlunoDAO;
import br.com.trabalho1.model.Aluno;

 
public class AlunoController {
    
    private IAlunoDAO alunoDao;
    
    public AlunoController(IAlunoDAO alunoDao){
        this.alunoDao = alunoDao;
    }
    
    public Aluno buscar(Integer matricula){
       return alunoDao.buscaPelaMatricula(matricula);
    }
    
}
