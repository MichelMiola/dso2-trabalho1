package br.com.trabalho1.controller.dao;

import br.com.trabalho1.model.Aluno;
import br.com.trabalho1.model.DiaDaSemanaEnum;
import br.com.trabalho1.model.converters.DiaDaSemanaEnumDeserialize;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AlunoDAOJsonImpl implements IAlunoDAO {

    private String json;
    private Map<Integer, Aluno> alunosCache = new HashMap<>();
    private final String JSON_FILE = "dados.json";
    
    public AlunoDAOJsonImpl() {
        this.json = loadJson();
        this.populaListaDeAlunos();
    }

    @Override
    public Aluno buscaPelaMatricula(Integer matricula) {
        return this.alunosCache.get(matricula);
    }

    private String loadJson() {
        try {
            InputStream jsonAsStream = AlunoDAOJsonImpl.class.getResourceAsStream(JSON_FILE);
            try (BufferedReader buffer = new BufferedReader(new InputStreamReader(jsonAsStream))) {
                return buffer.lines().collect(Collectors.joining("\n"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void populaListaDeAlunos() {
        Gson deserialize = this.createDeserialize();
        Aluno[] fromJson = deserialize.fromJson(json, Aluno[].class);
        for (int i = 0; i < fromJson.length; i++) {
            this.alunosCache.put(fromJson[i].getMatricula(), fromJson[i]);
        }     
    }

    private Gson createDeserialize() {
        GsonBuilder builder = new GsonBuilder();
        builder = new GsonBuilder();
        builder.registerTypeAdapter(DiaDaSemanaEnum.class, new DiaDaSemanaEnumDeserialize());
        return builder.create();
    }
    
}
