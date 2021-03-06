
package br.com.trabalho1.controller;

import br.com.trabalho1.model.Aluno;
import br.com.trabalho1.model.DiaDaSemanaEnum;
import br.com.trabalho1.model.Disciplina;
import br.com.trabalho1.model.Horario;
import br.com.trabalho1.model.Sala;
import br.com.trabalho1.model.converters.DiaDaSemanaEnumDeserialize;
import br.com.trabalho1.model.converters.DiaDaSemanaEnumSerialize;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class JsonCreatorUtils {
    
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        
        
        
        List<Disciplina> disciplinas = new ArrayList<>();
        
        
        
        
        Disciplina dso = new Disciplina();
        dso.setCodigo(11);
        dso.setNome("DSO II");
        
        Sala sala = new Sala();
        sala.setLocal("CTC");
        sala.setNumero(314);
        
        Horario horario = new Horario();
        horario.setSala(sala);
        horario.setDiaDaSemana(DiaDaSemanaEnum.SEGUNDA);
        horario.setHora(10);
        dso.addHorario(horario);
        
        sala = new Sala();
        sala.setLocal("CTC");
        sala.setNumero(311);
        
        horario = new Horario();
        horario.setSala(sala);
        horario.setDiaDaSemana(DiaDaSemanaEnum.QUARTA);
        horario.setHora(10);
        dso.addHorario(horario);
        
        
        disciplinas.add(dso);

        
        Aluno aluno = new Aluno();
        aluno.setDisciplinas(disciplinas);
        aluno.setMatricula(14201126);
        aluno.setNome("Valdir");
        
        
        alunos.add(aluno);
        
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(DiaDaSemanaEnum.class, new DiaDaSemanaEnumSerialize());
        
        Gson gson = builder.create();
        
        
        
        String json = gson.toJson(alunos);
        
        System.out.print(json);
         
        
        
       /*builder = new GsonBuilder();
       builder.registerTypeAdapter(DiaDaSemanaEnum.class, new DiaDaSemanaEnumDeserialize());
       Gson deserialize = builder.create();
       Aluno[] fromJson = deserialize.fromJson(json, Aluno[].class);
       System.err.println(fromJson[0].getDisciplinas().get(0).getHorarios().get(0).getDiaDaSemana());*/
    }
    
}
