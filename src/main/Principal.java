package main;

import clases.ClimatizacionA;
import clases.ClimatizacionB;
import clases.ClimatizacionC;
import interfaces.Climatizacion;

import java.util.Scanner;

/**
 * Clase principal que ejecuta un menú interactivo para seleccionar y controlar los diferentes sistemas de climatización 
 * disponibles (Climatización A, B o C). Permite a los usuarios ajustar configuraciones como temperatura, ventilación, 
 * modos de desempañador, entre otros, dependiendo del sistema seleccionado.
 * Autores: Javier Alvarado y Angel Sanabria
 *
 * Fecha de creación: 11 de noviembre del 2024
 * Fecha de modificación: 13 de noviembre del 2024
 */
public class Principal {
    
    /**
     * Método principal que arranca el programa, mostrando el menú de opciones y gestionando las acciones del usuario.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Climatizacion climatizacion = null;
        int opcion;

        // Bucle que permite al usuario seleccionar un sistema de climatización hasta que elija salir
        do {
            System.out.println("Seleccione el sistema de climatización:");
            System.out.println("1. Climatización A");
            System.out.println("2. Climatización B");
            System.out.println("3. Climatización C");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                climatizacion = new ClimatizacionA();
                ejecutarMenuClimatizacion(climatizacion, scanner);
            } else if (opcion == 2) {
                climatizacion = new ClimatizacionB();
                ejecutarMenuClimatizacion(climatizacion, scanner);
            } else if (opcion == 3) {
                climatizacion = new ClimatizacionC();
                ejecutarMenuClimatizacion(climatizacion, scanner);
            }
        } while (opcion != 4);

        scanner.close();
    }

    /**
     * Muestra el menú de opciones de un sistema de climatización seleccionado y permite al usuario interactuar con el sistema.
     * El menú incluye opciones como encender, apagar, ajustar temperatura, y activar modos específicos.
     * 
     * @param climatizacion El sistema de climatización seleccionado por el usuario.
     * @param scanner Objeto Scanner para capturar la entrada del usuario.
     */
    private static void ejecutarMenuClimatizacion(Climatizacion climatizacion, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\nOpciones de Climatización:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Ajustar Temperatura");
            System.out.println("4. Ajustar Ventilación");
            System.out.println("5. Activar Modo Automático");
            System.out.println("6. Activar Desempañador");
            System.out.println("7. Activar Modo Acelerado");
            System.out.println("8. Activar Espejos Laterales");
            System.out.println("9. Volver al menú principal");

            opcion = scanner.nextInt();

            // Ejecución de las acciones según la opción seleccionada
            if (opcion == 1) {
                climatizacion.encender();
            } else if (opcion == 2) {
                climatizacion.apagar();
            } else if (opcion == 3) {
                System.out.print("Ingrese incremento de temperatura: ");
                int incremento = scanner.nextInt();
                climatizacion.ajustarTemperatura(incremento);
            } else if (opcion == 4) {
                System.out.print("Ingrese nivel de ventilación: ");
                int nivel = scanner.nextInt();
                climatizacion.ajustarVentilacion(nivel);
            } else if (opcion == 5) {
                System.out.print("Ingrese temperatura exterior: ");
                int temperaturaExterior = scanner.nextInt();
                climatizacion.activarModoAutomático(temperaturaExterior);
            } else if (opcion == 6) {
                climatizacion.activarDesempañador();
            } else if (opcion == 7) {
                climatizacion.activarModoAcelerado();
            } else if (opcion == 8) {
                // Comprobación para asegurarse de que los espejos laterales solo se activen en Climatización A o B
                if (climatizacion instanceof ClimatizacionA || climatizacion instanceof ClimatizacionB) {
                    climatizacion.activarEspejosLaterales();
                } else {
                    System.out.println("La opción de espejos laterales no está disponible en este modelo.");
                }
            }
        } while (opcion != 9);
    }
}
