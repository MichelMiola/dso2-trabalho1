/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho1.controller.dao;

import br.com.trabalho1.model.Aluno;

/**
 *
 * @author 07155422908
 */
public interface IAlunoDAO {
    
    public Aluno buscaPelaMatricula(Integer matricula);
    
}
