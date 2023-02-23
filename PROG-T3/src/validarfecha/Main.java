package validarfecha;

import PracticaFinal.Validaciones;

import java.util.Scanner;

import static PracticaFinal.Validaciones.Comprobarfecha;

public class Main {

        public static boolean Comprobarfecha(String fechaNacimiento) {
            if (fechaNacimiento.equals("")) {
                return false;
            }

            // Verificar longitud de entrada: dd/mm/yyyy o dd-mm-yyyy
            if (fechaNacimiento.length() != 10 ||
                    (fechaNacimiento.charAt(2) != '/' && fechaNacimiento.charAt(2) != '-') ||
                    (fechaNacimiento.charAt(5) != '/' && fechaNacimiento.charAt(5) != '-')) {
                return false;
            }
            // Analizar la cadena de entrada para obtener los valores numéricos de día, mes y año
            int dia, mes, anio;
            try {
                dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
                mes = Integer.parseInt(fechaNacimiento.substring(3, 5));
                anio = Integer.parseInt(fechaNacimiento.substring(6));
            } catch (NumberFormatException e) {
                return false; // La entrada no es numérica
            }

            // Verificar que la fecha sea válida
            if (anio < 1900 || anio > 2023) {
                return false;
            }
            if (mes < 1 || mes > 12) {
                return false;
            }
            if (dia < 1 || dia > 31) {
                return false;
            }

            // La fecha es válida
            return true;
        }

        public  int diasEnMes(int mes, int anio) {
            // Verificar el número de días en un mes dado (febrero varía según si es año bisiesto)
            if (mes == 2) {
                return esBisiesto(anio) ? 29 : 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return 30;
            } else {
                return 31;
            }
        }

        public  boolean esBisiesto(int anio) {
            // Verificar si un año es bisiesto (divisible entre 4, pero no divisible entre 100, a menos que también sea divisible entre 400)
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }





    //Fecha de nacimiento
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fechaNacimiento;
        while (true) {
            System.out.println("Fecha de Nacimiento (dd/mm/aaaa): ");
            fechaNacimiento = sc.nextLine();
            if (Comprobarfecha(fechaNacimiento)) {
                break;
            } else {
                System.out.println("Fecha no valida");
            }
        }
    }

    }





