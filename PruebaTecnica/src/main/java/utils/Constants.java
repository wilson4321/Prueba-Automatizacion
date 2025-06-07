package utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    private static Constants instance;
    private Map<String, String> constantDir = new HashMap<String, String>();

    private Constants() {

        constantDir.put("Sauce Demo Login", "https://www.saucedemo.com/");
        constantDir.put("Mensaje Error", "Epic sadface: Username and password do not match any user in this service");
        constantDir.put("Usuario correcto", "standard_user");
        constantDir.put("Contraseña correcta", "secret_sauce");
        constantDir.put("Usuario incorrecto", "wilson");
        constantDir.put("Contraseña incorrecta", "araque");

        constantDir.put("Primer_nombre", "Wilson");
        constantDir.put("Primer_apellido", "Araque");
        constantDir.put("Codigo_postal", "12345");

        constantDir.put("Compra Finalizada", "Thank you for your order!");


    }

    public static String getData(String key) {
        if (instance == null) {
            instance = new Constants();
        }
        return instance.constantDir.get(key);
    }
}
