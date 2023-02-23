package PracticaFinal;

/**
 * @AUTHOR Lorenzo Gonzalez Cabrera
 */

public class Validaciones {

    //Comprobación de nombre y apellidos

    /**
     * En la primera parte valida que no se se quede vacio.
     * En la parte media valida que el rango sea entre A y Z.
     * En la parte final valida que introduzcas caracteres especiales.
     * @param palabra
     * @return Retorna la palabra correcta
     */

    public static boolean Comprobarpalabras(String palabra) {
        palabra = palabra.toUpperCase();
        palabra = palabra.replace(" ", "");
        if (palabra.equals("")) {
            System.out.println("No has introducido nada.");

            return false;
        }
        for (int i = 0; i < palabra.length(); i++) {
            //Verificamos que sean letras
            if (palabra.charAt(i) < 'A' && palabra.charAt(i) > 'Z') {
                System.out.println("Palabra no valida");
                return false;
            }
        }

        //Aquí comprobamos especificamos el rango de letras que se utilizará

        for (int i = 0; i < palabra.length(); i++) {
            if (((palabra.charAt(i) >= 'A') && (palabra.charAt(i) <= 'Z'))
                    || palabra.charAt(i) == 'ñ' || palabra.charAt(i) == 'Ñ'
                    || palabra.charAt(i) == 'ç' || palabra.charAt(i) == 'Ç' || palabra.charAt(i) == 'á'
                    || palabra.charAt(i) == 'Á' || palabra.charAt(i) == 'é' || palabra.charAt(i) == 'É'
                    || palabra.charAt(i) == 'í' || palabra.charAt(i) == 'Í' || palabra.charAt(i) == 'ó'
                    || palabra.charAt(i) == 'Ó' || palabra.charAt(i) == 'ú' || palabra.charAt(i) == 'Ú') {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    //Comprobacion de el email

    /**
     * Comprueba que el email sea correcto, valida que contenga un @ y un . a continuación
     * @param email
     * @return Retorna el email verificado
     */
    public static boolean Comprobaremail(String email) {
        email = email.toUpperCase();
        int contadorarroba = 0;
        email = email.trim();
        String subemail;
        String subpunto;
        int contadorpunto = 0;
        int posicionarroba = email.indexOf('@');
        int posicionpunto = email.indexOf('.');

        //Comprobamos que la longitud no sea inferior a 0, ni superior a 50
        if (email.length() == 0 || email.length() > 50) {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            //Verificamos que sean letras
            if (email.charAt(i) < 'A' && email.charAt(i) > 'Z') {
                System.out.println("Email no valido");
                return false;
            }
            if (email.charAt(i) == '@') {
                contadorarroba++;
            }
        }

        for (int i = 0; i < email.length(); i++) {
            //Verificamos que la arroba este presente y no sea mas de 1
            if (contadorarroba != 1 || (email.charAt(0) == '@')) {
                System.out.println("Introduce algo antes de la arroba");
                return false;
            }
            if (email.indexOf('@') == -1) {
                System.out.println("Falta la @");
                return false;
            }
        }
        //Comprobamos la presencia de @
        subemail = email.substring(posicionarroba);

        if (subemail.length() > 10) {
            return false;
        }
        for (int i = 0; i < subemail.length(); i++) {
            if (subemail.charAt(i) == '.') {
                contadorpunto++;
            }
        }
        for (int i = 0; i < email.length(); i++) {
            if (contadorpunto != 1 || (subemail.charAt(1) == '.')) {
                System.out.println("Puntos Erroneos");
                return false;
            }
            if (subemail.indexOf('.') == -1) {
                return false;
            }
        }
        //Comprobamos el punto
        subpunto = email.substring(posicionpunto);

        if (subpunto.length() < 1 || subpunto.length() < 4) {
            System.out.println("Establece una extension correcta");
            return false;
        }
        return true;
    }

    

    //Comprobacion del telefono
    public static boolean Comprobartelefono(String telefono) {
        telefono = telefono.replace(" ", "");

        //Comprobamos la longitud del numero
        if (telefono.length() != 9) {
            System.out.println("Longitud erronea");
            return false;
        }
        for (int i = 0; i < telefono.length(); i++) {
            //Verificamos que solo se introduzcan numeros
            if (telefono.charAt(i) < '0' || telefono.charAt(i) > '9') {
                System.out.println("Introduce números");
                return false;
            }
            //Verificamos que solo introduzcan numeros nacionales
            if (telefono.charAt(0) < '6' || telefono.charAt(0) > '9') {
                System.out.println("Introduce un númuero Nacional");
                return false;
            }
        }
        return true;
    }

    //Comprobación de la fecha de nacimiento
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
        if (anio < 1900 || anio > 2004) {
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
    //Comprobacion de Dias, Meses y Años.
    public   int diasEnMes(int mes, int anio) {
        // Verificar el número de días en un mes dado (febrero varía según si es año bisiesto)
        if (mes == 2) {
            return esBisiesto(anio) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    //Comprobación si es un año bisiesto.
    public  boolean esBisiesto(int anio) {
        // Verificar si un año es bisiesto (divisible entre 4, pero no divisible entre 100, a menos que también sea divisible entre 400)
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    //Comprobacion Frase de control
    //totalpal,totalCod, totalCodnum y codigoNumericoTotol estan relacionadas con Comprobar frase
    public static int totalPal;
    public static int totalCod;
    public static int totalCodNum;
    public static String codigoNumericoTotal;
    //Comprobacion de la frase de contro
    public static boolean Comprobarfrase(String fraseControl) {

        fraseControl = fraseControl.toLowerCase();
        String codigoFinal="";
        String[] palabras = fraseControl.split(" ");
        int totalPalabras = 0;
        char texto[]=new char[4];
        String texto2="";
        int cod = 0;
        int codNum = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()!=0) {
                totalPalabras++;
                cod=cod+palabras[i].charAt(0);      //Primera posicion
                texto[i]=(char)palabras[i].charAt(0);
                texto2=palabras[i].charAt(0)+"";
                codNum=codNum+(int)palabras[i].charAt(palabras[i].length()-1);
                totalPal = totalPalabras;
                totalCod = cod;
                int codNumDividido = codNum / totalPalabras; //total 108
                int codigoModulo = codNum % 4;
                totalCodNum = codNumDividido - codigoModulo;
            }else{
                System.out.println("Introduce un grupo de 4 palabras");
                return false;
            }



            String palabra1 = palabras[i].charAt(0)+"";
            codigoFinal = codigoFinal+palabra1;
        }
        codigoNumericoTotal=codigoFinal+(totalCodNum+"");
        codigoNumericoTotal = codigoNumericoTotal.toUpperCase();

        return true;
    }
    //Comprobacion del numero de habitaciones disponibles en ese momento
    public static boolean Comprobarnpersonas(String nReservas) {
        if (nReservas.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < nReservas.length(); i++) {
                if (nReservas.charAt(i) < '1' || nReservas.charAt(i) > '4') {
                    return false;
                }
            }
        }
        return true;
    }
    //Comprobación de la fecha de entrada
    public static boolean ComprobarfechaReservaEntrada(String fechaEntrada) {
        String dia;
        String mes;
        String anyo;
        int contadorprimer = 0;
        fechaEntrada = fechaEntrada.replace(" ", "");
        int primerbarra = fechaEntrada.indexOf('/');
        int segundabarra = fechaEntrada.indexOf('/');

        //Comprobamos que la cadena no pase X caracteres
        if (fechaEntrada.length() >= 12) {
            System.out.println("Introduce una fecha correcta");
            return false;
        }

        //Verificamos que el rango sera numerico
        for (int i = 0; i < fechaEntrada.length(); i++) {
            if ((fechaEntrada.charAt(i) < '0' && fechaEntrada.charAt(i) > '9')) {
                System.out.println("Introduce valores numericos");
                return false;
            }

            if (fechaEntrada.charAt(0) < '0' || fechaEntrada.charAt(0) > '3') {
                System.out.println("Introduce un dia valido");
                return false;
            }

            //Verificamos la posicion de la barra
            if (fechaEntrada.charAt(i) == '/' || fechaEntrada.charAt(i) == '-') {
                if (contadorprimer == 0) {
                    primerbarra = i;
                }
                contadorprimer++;
            }
        }

        // Se comprueba la posicion de la segunda barra
        for (int i = 0; i < fechaEntrada.length(); i++) {
            if (contadorprimer != 2 || (fechaEntrada.charAt(2) != '/' && fechaEntrada.charAt(5) != '/')) {
                System.out.println("Formato Invalido");
                return false;
            }
        }
        return true;
    }
    //Comprobación de la fecha de Salida
    public static boolean ComprobarfechaReservaSalida(String fechaSalida) {
        String dia;
        String mes;
        String anyo;
        int contadorprimer = 0;
        fechaSalida = fechaSalida.replace(" ", "");
        int primerbarra = fechaSalida.indexOf('/');
        int segundabarra = fechaSalida.indexOf('/');

        //Comprobamos que la cadena no pase X caracteres
        if (fechaSalida.length() >= 12) {
            System.out.println("Introduce una fecha correcta");
            return false;
        }

        //Verificamos que el rango sera numerico
        for (int i = 0; i < fechaSalida.length(); i++) {
            if ((fechaSalida.charAt(i) < '0' && fechaSalida.charAt(i) > '9')) {
                System.out.println("Introduce valores numericos");
                return false;
            }

            if (fechaSalida.charAt(0) < '0' || fechaSalida.charAt(0) > '3') {
                System.out.println("Introduce un dia valido");
                return false;
            }

            //Verificamos la posicion de la barra
            if (fechaSalida.charAt(i) == '/' || fechaSalida.charAt(i) == '-') {
                if (contadorprimer == 0) {
                    primerbarra = i;
                }
                contadorprimer++;
            }
        }

        // Se comprueba la posicion de la segunda barra
        for (int i = 0; i < fechaSalida.length(); i++) {
            if (contadorprimer != 2 || (fechaSalida.charAt(2) != '/' && fechaSalida.charAt(5) != '/')) {
                System.out.println("Formato Invalido");
                return false;
            }
        }
        return true;
    }
    //Comprobacion de las opcines de los menus

    public static boolean ComprobarOpcion(String nOpcion) {
        if (nOpcion.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < nOpcion.length(); i++) {
                if (nOpcion.charAt(i) < '1' || nOpcion.charAt(i) > '2') {
                    return false;
                }
            }
        }
        return true;
    }
    //Comprobación de la tarjeta de credito
    public static boolean TipoTarjeta(String numTarjeta) {
        if (numTarjeta.length() < 15){
            System.out.println("Una tarjeta valida debe tener 16 digitos");
            return false;
        }
        if (numTarjeta.length() > 17){
            System.out.println("La tarjeta tiene demasiados numeros");
            return false;
        }

        int[] digitos = new int[numTarjeta.length()];
        for (int i = 0; i < numTarjeta.length(); i++) {
            digitos[i] = Character.getNumericValue(numTarjeta.charAt(i));
        }


        int sum = 0;
        for (int i = digitos.length - 2; i >= 0; i -= 2) {
            int doble = digitos[i] * 2;
            if (doble > 9) {
                doble -= 9;
            }
            sum += doble;
        }
        for (int i = digitos.length - 1; i >= 0; i -= 2) {
            sum += digitos[i];
        }

        if (sum % 10 == 0) {
            // Identificar el tipo de tarjeta según los primeros dígitos
            if (numTarjeta.startsWith("37")) {
                System.out.println("American Express");
                return true;
            } else if (numTarjeta.startsWith("4")) {
                System.out.println("Visa");
                return true;
            } else if (numTarjeta.startsWith("5")) {
                int primerosDigitos = Integer.parseInt(numTarjeta.substring(0, 2));
                if (primerosDigitos >= 51 && primerosDigitos <= 55) {
                    System.out.println("Mastercard");
                    return true;
                }
            }
        }

        return true;
    }


}
