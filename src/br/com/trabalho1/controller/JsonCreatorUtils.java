/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho1.controller;

import br.com.trabalho1.model.Aluno;
import br.com.trabalho1.model.DiaDaSemanaEnum;
import br.com.trabalho1.model.Disciplina;
import br.com.trabalho1.model.Horario;
import br.com.trabalho1.model.converters.DiaDaSemanaEnumDeserialize;
import br.com.trabalho1.model.converters.DiaDaSemanaEnumSerialize;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 07101736955
 */
public class JsonCreatorUtils {
    
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        
        
        
        List<Disciplina> disciplinas = new ArrayList<>();
        
        
        Disciplina d = new Disciplina();
        d.setCodigo(11);
        d.setNome("DSO II");
        
        //TODO: alterar dia e hora para uma enum
        Horario horario = new Horario();
        horario.setDiaDaSemana(DiaDaSemanaEnum.SEGUNDA);
        horario.setHora(1);
        d.setHorario(horario);
        disciplinas.add(d);
        
        Aluno aluno = new Aluno();
        aluno.setDisciplinas(disciplinas);
        aluno.setMatricula(123);
        aluno.setNome("Valdir");
        
        
        alunos.add(aluno);
        
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(DiaDaSemanaEnum.class, new DiaDaSemanaEnumSerialize());
        
        Gson gson = builder.create();
        
        
        
        String json = gson.toJson(alunos);
        
         
        
        
       builder = new GsonBuilder();
       builder.registerTypeAdapter(DiaDaSemanaEnum.class, new DiaDaSemanaEnumDeserialize());
       Gson deserialize = builder.create();
       Aluno[] fromJson = deserialize.fromJson(json, Aluno[].class);
       System.err.println(fromJson[0].getDisciplinas().get(0).getHorario().getDiaDaSemana());
    }
    
}
