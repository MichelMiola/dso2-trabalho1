
package br.com.trabalho1.controller;

import br.com.trabalho1.controller.dao.AlunoDAOJsonImpl;
import br.com.trabalho1.view.TelaAluno;

public class ControladorPrincipal {
    
    private AlunoDAOJsonImpl alunoDAOJsonImpl;
    private AlunoController alunoController;
    private TelaAluno telaAluno;

    public ControladorPrincipal() {
        this.alunoDAOJsonImpl =  new AlunoDAOJsonImpl();
        this.alunoController = new AlunoController(alunoDAOJsonImpl);
        this.telaAluno =  new TelaAluno(alunoController);
    }
    
    public void iniciar(){
        this.telaAluno.setVisible(true);
    }
   
}
