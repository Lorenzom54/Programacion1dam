package PracticaFinal;

/**
 * @AUTHOR Lorenzo González Cabrera
 * @SINCE 01/11/
 * @VERSION JDK 18
 *
 * Tarifa Dremas
 */


import java.util.*;


public class Main {

    public static ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    public static ArrayList<Reservas> listaReservas = new ArrayList<>();
    public static ArrayList<Faqs> listaPreguntas = new ArrayList<>();

    public static ArrayList<Cliente> mostrarClientes = new ArrayList<>();

    public static void main(String[] args) {
        GestorHabitaciones gesH = new GestorHabitaciones(listaHabitaciones);
        GestorFaqs gesF = new GestorFaqs(listaPreguntas);
        GestorClientes gesC = new GestorClientes();
        GestorReservas gesR = new GestorReservas(listaReservas);


        Scanner sc = new Scanner(System.in);
        //Declaramos variables

        String opciones;
        String opciones2 = null;
        String opciones3;
        String opciones4;
        String nombre, apellidos, emailregistro, telefono, fechaNacimiento;
        String email;
        String fraseControl;
        String fraseControlRegistro;
        String nReservas = "";
        String fechaEntrada;
        String fechaSalida;
        String nOpcion;
        String numTarjeta;

        boolean salir = false;

        do {

            boolean salirAplicacion = false;
            Cliente nuevo;

            //Mostramos Menu
            System.out.println("*************************");
            System.out.println("***** TARIFA DREAMS *****");
            System.out.println("*************************");

            System.out.println("1. Registro usuario");
            System.out.println("2. Login Usuario");
            System.out.println("3. SALIR");
            opciones = sc.nextLine();

            switch (opciones) {
                case "1":

                    System.out.println("************");
                    System.out.println("**REGISTRO**");
                    System.out.println("************");
                    System.out.println("Introduce los siguientes datos:");
                    System.out.println("-------------------");

                    //Nombre
                    while (true) {
                        System.out.println("Nombre: ");
                        nombre = sc.nextLine();
                        if (Validaciones.Comprobarpalabras(nombre)) {
                            break;
                        } else {
                            System.out.println("Nombre no valido");
                        }
                    }

                    //Apellidos
                    while (true) {
                        System.out.println("Apellidos: ");
                        apellidos = sc.nextLine();
                        if (Validaciones.Comprobarpalabras(apellidos)) {
                            break;
                        } else {
                            System.out.println("Apellido no valido");
                        }

                    }

                    //Email
                    while (true) {
                        System.out.println("Email: ");
                        email = sc.nextLine();
                        if (Validaciones.Comprobaremail(email)) {
                            break;
                        } else {
                            System.out.println("Email no valido");
                        }
                    }

                    //Telefono
                    while (true) {
                        System.out.println("Teléfono");
                        telefono = sc.nextLine();
                        if (Validaciones.Comprobartelefono(telefono)) {
                            break;
                        } else {
                            System.out.println("Telefono no valido");
                        }
                    }

                    //Fecha de nacimiento
                    while (true) {
                        System.out.println("Fecha de Nacimiento (dd/mm/aaaa): ");
                        fechaNacimiento = sc.nextLine();
                        if (Validaciones.Comprobarfecha(fechaNacimiento)) {
                            break;
                        } else {
                            System.out.println("Fecha no valida");
                        }
                    }

                    //Frase de control
                    while (true) {
                        System.out.println("Frase de control (4 Palabras separados por espacios, la primera letra de cada palabra en mayuscula)");
                        fraseControl = sc.nextLine();
                        if (Validaciones.Comprobarfrase(fraseControl)) {
                            System.out.println(Validaciones.codigoNumericoTotal);
                            break;
                        } else {
                            System.out.println("Frase no valida");
                        }
                    }

                    nuevo = new Cliente(nombre, apellidos, email, telefono, fechaNacimiento, fraseControl);
                    gesC.agregarCliente(nuevo);
                    break;

                //Al pulsar en el 2 tendremos que introducir el EMAIL de nuevo
                case "2":

                    while (!salirAplicacion) {

                        System.out.println("****************");
                        System.out.println("Login de Usuario");
                        System.out.println("****************");

                        System.out.println("Introduce el Email de registro: (lorenzo)");
                        emailregistro = sc.nextLine();
                        System.out.println("Introduce la contraseña: (golfo)");
                        fraseControlRegistro = sc.nextLine();

                        if ((Validaciones.Comprobaremail(emailregistro) && Validaciones.Comprobarfrase(fraseControlRegistro)) || (emailregistro.equals("lorenzo") && fraseControlRegistro.equals("golfo"))) {
                        } else {
                            System.out.println("Usuario no registrado\n");
                            break;
                        }
                    //Mostramos Menu

                        do {
                            System.out.println("\n1. Reserva de Habitación");
                            System.out.println("2. Atencion al cliente");
                            System.out.println("3. Pago on-line con factura");
                            System.out.println("4. Salir");
                            opciones2 = sc.nextLine();

                            switch (opciones2) {

                                case "1":
                                    System.out.println("*************************");
                                    System.out.println("***RESERVAR HABITACIÓN***");
                                    System.out.println("*************************");

                                    //Preguntamos el nº de Personas

                                    while (true) {
                                        System.out.println("¿Para cuantas personas es la resrva?: ");
                                        nReservas = sc.nextLine();
                                        if (Validaciones.Comprobarnpersonas(nReservas)) {
                                            break;
                                        } else {
                                            System.out.println("Introduce un valor correcto (MAX 4)");
                                        }
                                    }
                                    // Se pregunta cual es la fecha de entrada

                                    while (true) {
                                        System.out.println("¿Cuál es la fecha de entrada?: ");
                                        fechaEntrada = sc.nextLine();
                                        if (Validaciones.ComprobarfechaReservaEntrada(fechaEntrada)) {
                                            break;
                                        } else {
                                            System.out.println("Introduce una fecha correcta (dd/mm/aaaa)");
                                        }
                                    }
                                    // Se pregunta cual es la fecha de salida

                                    while (true) {
                                        System.out.println("¿Cuál es la fecha de salida?: ");
                                        fechaSalida = sc.nextLine();
                                        if (Validaciones.ComprobarfechaReservaSalida(fechaSalida)) {
                                            break;
                                        } else {
                                            System.out.println("Introduce una fecha correcta (dd/mm/aaaa)");
                                        }
                                    }
                                    // Se muestran las las habitaciones disponibles
                                    if (nReservas.equals("1")){
                                        System.out.println("1. " + gesH.getListaHabitaciones().get(0));
                                        System.out.println("2. " + gesH.getListaHabitaciones().get(1));
                                    }

                                    if (nReservas.equals("2")){
                                        System.out.println("1. " + gesH.getListaHabitaciones().get(2));
                                        System.out.println("2. " + gesH.getListaHabitaciones().get(3));
                                    }
                                    if (nReservas.equals("3")){
                                        System.out.println("1. " + gesH.getListaHabitaciones().get(4));
                                        System.out.println("2. " + gesH.getListaHabitaciones().get(5));
                                    }

                                    if (nReservas.equals("4")){
                                        System.out.println("1. " + gesH.getListaHabitaciones().get(6));
                                        System.out.println("2. " + gesH.getListaHabitaciones().get(7));
                                    }

                                    //Introducir un numero valido
                                    while (true) {
                                        System.out.println("¿Que opcion desea?: ");
                                        nOpcion = sc.nextLine();
                                        if (Validaciones.Comprobarnpersonas(nOpcion)) {
                                            System.out.println("HABITACIÓN RESERVADA\n");
                                            break;
                                        } else {
                                            System.out.println("Introduce una opción valida");
                                        }
                                    }

                                    break;

                                case "2":

                                    System.out.println("*******PREGUNTAS FRECUENTES*******");
                                    boolean salirPreguntas = false;

                                    while (!salirPreguntas) {
                                        System.out.println("1. " + gesF.getListapreguntas().get(0).getPregunta());
                                        System.out.println("2. " + gesF.getListapreguntas().get(1).getPregunta());
                                        System.out.println("3. " + gesF.getListapreguntas().get(2).getPregunta());
                                        System.out.println("0: Salir");

                                        do {

                                            System.out.println("Escoge una opcion: ");
                                            opciones3 = sc.nextLine();

                                            switch (opciones3) {
                                                case "1":
                                                    System.out.println(gesF.getListapreguntas().get(0).getRespuesta());
                                                    break;
                                                case "2":
                                                    System.out.println(gesF.getListapreguntas().get(1).getRespuesta());
                                                    break;
                                                case "3":
                                                    System.out.println(gesF.getListapreguntas().get(2).getRespuesta());
                                                    break;
                                                case "0":
                                                    System.out.println("Saliendo.....");
                                                    salirPreguntas = true;
                                                    break;
                                            }

                                        } while (!salirPreguntas);

                                    }
                                    break;

                                case "3":

                                    boolean salirPago = false;

                                    while (!salirPago) {

                                        do {
                                            System.out.println("\n******************************");
                                            System.out.println("***PAGO ON-LINE CON FACTURA***");
                                            System.out.println("******************************");
                                            System.out.println("1. Tarjeta de Crédito");
                                            System.out.println("2. Bizum");
                                            System.out.println("0: Salir");
                                            opciones4 = sc.nextLine();

                                            switch (opciones4) {

                                                case "1":
                                                    System.out.println("******************************");
                                                    System.out.println("******TARJETA DE CRÉDITO******");
                                                    System.out.println("******************************");
                                                    while (true) {
                                                        System.out.println("Introduce el numero de tarjeta, sin guiones y sin espacios: ");
                                                        numTarjeta = sc.nextLine();
                                                        if (Validaciones.TipoTarjeta(numTarjeta)) { //Se valida que la tarjeta sea valida.
                                                            break;
                                                        } else {
                                                            System.out.println("No se ha podido validar la tarjeta");
                                                        }
                                                    }

                                                    Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
                                                    int dia = calendar.get(Calendar.DAY_OF_MONTH);
                                                    int mes = calendar.get(Calendar.MONTH) + 1;
                                                    int anyo = calendar.get(Calendar.YEAR);

                                                    System.out.println("\n*****************************");
                                                    System.out.println("***********FACTURA***********");
                                                    System.out.println("*****************************\n");
                                                    //Se muestra la factura, junto a los datos del cliente
                                                    System.out.println("Datos del Cliente: ");
                                                    System.out.println(gesC.listadoClientes);
                                                    System.out.println("Fecha de Factura: " + dia + "/" + mes + "/" + anyo);
                                                    int codigoaleatorio = (int) (Math.random() * 10000);
                                                    System.out.println("Codigo de factura: " + codigoaleatorio);
                                                    System.out.println("Nombre de la Habitación: " + gesH.getListaHabitaciones().get(0));
                                                    System.out.println("Descripción de la estancia:");
                                                    System.out.println("La estancia contará con: " + nReservas + " personas.");
                                                    System.out.println("A nombre de: " + gesC.listadoClientes.get(0).getNombre() + ", con teléfono: " + gesC.listadoClientes.get(0).getTelefono());
                                                    System.out.println("Su precio con IVA (21%) incluido sera de " + listaHabitaciones.get(0).getPrecio()*1.21);
                                                    System.out.println("\nPAGADO CON TARJETA DE CREDITO");
                                                    System.out.println("\nGRACIAS");
                                                    salirPago = true;
                                                    salirAplicacion = true;
                                                    salir = true;
                                                break;

                                                case "2":
                                                    System.out.println("\n*****************************");
                                                    System.out.println("************BIZUM************");
                                                    System.out.println("*****************************");
                                                    System.out.println("Este es el número, para realizar el Bizum");
                                                    System.out.println("656544234");
                                                    System.out.println("\nPAGADO CON BIZUM");
                                                    System.out.println("\nGRACIAS");
                                                    salirPago = true;
                                                    salirAplicacion = true;
                                                    salir = true;

                                                    //Al terminar el pago, se terminará el programa
                                                break;


                                                case "0":
                                                    salirPago = true;
                                                    break;

                                                }
                                            } while (!salirPago);

                                        }
                                    break;
                                case "4":
                                    salirAplicacion = true;
                                    break;
                                default:
                                    System.out.println("Opcion no valida.");
                            }
                        } while (!salirAplicacion);
                    }
                    break;

                case "3":
                    System.out.println("SALIENDO.......");
                    salir = true;
                    break;

                default:
                    System.out.println("Numero no valido");
                    break;
            }
        } while (!salir) ;
    }
}

