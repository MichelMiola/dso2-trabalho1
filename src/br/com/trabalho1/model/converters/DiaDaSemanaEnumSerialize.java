package br.com.trabalho1.model.converters;

import br.com.trabalho1.model.DiaDaSemanaEnum;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;


public class DiaDaSemanaEnumSerialize implements JsonSerializer<DiaDaSemanaEnum> {

    @Override
    public JsonElement serialize(DiaDaSemanaEnum t, Type type, JsonSerializationContext jsc) {
        JsonObject object = new JsonObject();         
        object.addProperty("des", t.getDes());
        object.addProperty("codigo", t.getCodigo());
        return object;
    }

   
    
}
