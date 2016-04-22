/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho1.controller;

import br.com.trabalho1.controller.dao.AlunoDAOJsonImpl;
import br.com.trabalho1.view.TelaAluno;

/**
 *
 * @author 07155422908
 */
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
