package com.tundemichael.blog.jsonlib;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

public class JsonLib {

    private static final Logger LOG = Logger.getLogger(JsonLib.class.getName());

    public static void main(String[] args) {
        try {
            System.out.println("================== Ant ====================");
            System.out.println("Concated String --> " + buildWithConcatedString());
            System.out.println("Built with Gson --> " + buildWithGson());
            System.out.println("Built with Jackson --> " + buildWithJackson());
            System.out.println("Built with Primefaces --> " + buildWithPrimefaces());
            System.out.println("Built with Java EE 7  --> " + buildWithJSONP());
            System.out.println("Built with Jenson --> " + buildWithGson());
        } catch (Exception e) {
            LOG.log(Level.SEVERE, null, e);
        }

    }

    public static String buildWithConcatedString() {
        String json = "{"
                + "\"firstname\":\"John\","
                + "\"lastname\":\"Doe\","
                + "\"phone\":\"2348xxxxx3477\","
                + "\"email\":\"john@johndoe.com\""
                + "}";
        return json;
    }

    public static String buildWithGson() {
        JsonObject json = new JsonObject();
        json.addProperty("firstname", "John");
        json.addProperty("lastname", "Doe");
        json.addProperty("phone", "2348xxxxx3477");
        json.addProperty("email", "john@johndoe.com");
        return json.toString();
    }

    public static String buildWithJackson() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode();
        json.put("firstname", "John");
        json.put("lastname", "Doe");
        json.put("phone", "2348xxxxx3477");
        json.put("email", "john@johndoe.com");
        return json.toString();
    }

    public static String buildWithPrimefaces() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("firstname", "John");
        json.put("lastname", "Doe");
        json.put("phone", "2348xxxxx3477");
        json.put("email", "john@johndoe.com");
        return json.toString();
    }

    public static String buildWithJSONP() {
        JsonObjectBuilder json = Json.createObjectBuilder();
        json.add("firstname", "John");
        json.add("lastname", "Doe");
        json.add("phone", "2348xxxxx3477");
        json.add("email", "john@johndoe.com");
        return json.build().toString();
    }

}
