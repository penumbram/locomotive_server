package app.rest.util;

import app.rest.socket.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by tolgacaner on 27/04/2017.
 */
public class Utility {

    public static <T> T stringToJSONObject(String string, Class<T> valueType) {
        ObjectMapper mapper = new ObjectMapper();
        T t = null;
        try {
            t = mapper.readValue(string, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static String JSONObjectToString(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonInString;
    }
}
