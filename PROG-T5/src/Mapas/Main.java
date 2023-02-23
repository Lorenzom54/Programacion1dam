package Mapas;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> profesores=new HashMap<>();
        profesores.put("PROG","Mari Carmen");
        profesores.put("BD","Victor");
        profesores.put("ING", "Isabel");
        profesores.put("FOL","Carlos");

        System.out.println(profesores);
        System.out.println(profesores.keySet());
        System.out.println(profesores.values());
        System.out.println(profesores.get("PROG"));
        System.out.println(profesores.remove("BD"));

    }
}
