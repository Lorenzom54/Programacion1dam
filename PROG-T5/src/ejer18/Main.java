package ejer18;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String>empleados=new HashMap<>();

        empleados.put("Nombre", "Lorenzo");
        empleados.put("Puesto de Trabajo", "Informatico");
        empleados.put("DNI", "29597343T");


        System.out.println(empleados.get("Nombre"));
        System.out.println(empleados.get("Puesto de Trabajo"));
        System.out.println(empleados.get("DNI"));

    }
}
