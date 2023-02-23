package ejemploBase;

import java.util.Date;

public class Cliente {

        //Declaramos variables (Atributos)

        String dni;
        String nombre;
        String apellidos;
        Date fecha_nacimiento;
        boolean soltero;
        int num_hijos;
        String email;
        String telf;

        //Metodos
        public int edadCliente() {
            return 0;
        }

        public void infoCliente() {
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apellidos: " + this.apellidos);
            System.out.println("Teléfono: " + this.telf);
            System.out.println("Email: " + this.email);
        }


}
