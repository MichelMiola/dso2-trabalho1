/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalho1.model.converters;

import br.com.trabalho1.model.DiaDaSemanaEnum;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author 07101736955
 */
public class DiaDaSemanaEnumDeserialize implements JsonDeserializer<DiaDaSemanaEnum> {

    @Override
    public DiaDaSemanaEnum deserialize(JsonElement json, Type type, JsonDeserializationContext jdc)
            throws JsonParseException {
        int asInt = json.getAsJsonObject().get("codigo").getAsInt();
        
        return DiaDaSemanaEnum.getByCodigo(asInt);
        
    }

}
