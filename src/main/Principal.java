package main;

import clases.ClimatizacionA;
import clases.ClimatizacionB;
import clases.ClimatizacionC;
import interfaces.Climatizacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Climatizacion climatizacion = null;
        int opcion;

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
                if (climatizacion instanceof ClimatizacionA || climatizacion instanceof ClimatizacionB) {
                    // Solo las clases A y B permiten activar los espejos laterales
                    climatizacion.activarEspejosLaterales();
                } else {
                    System.out.println("La opción de espejos laterales no está disponible en este modelo.");
                }
            }
        } while (opcion != 9);
    }
}
