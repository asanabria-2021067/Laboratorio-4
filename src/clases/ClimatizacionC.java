package clases;

import interfaces.Climatizacion;

/**
 * Clase que implementa la interfaz Climatizacion y representa un sistema de climatización 
 * de tipo C con funcionalidades básicas de control de temperatura, ventilación y desempañador.
 * Esta clase está diseñada para ofrecer una experiencia más simple en comparación con otras clases.
 * Autores: Javier Alvarado y Angel Sanabria
 * 
 * Fecha de creación: 11 de noviembre del 2024
 * Fecha de modificación: 13 de noviembre del 2024
 */
public class ClimatizacionC implements Climatizacion {

    private boolean desempañadoActivo;
    private int temperatura;
    private int ventilacion;

    /**
     * Constructor por defecto que inicializa los valores predeterminados del sistema de climatización.
     */
    public ClimatizacionC() {
        this.desempañadoActivo = false;
        this.temperatura = 22;  // Temperatura inicial en grados Celsius
        this.ventilacion = 2;  // Nivel de ventilación inicial (menor que en otras clases)
    }

    /**
     * Enciende el sistema de climatización.
     */
    @Override
    public void encender() {
        System.out.println("Climatización Clase C: Encendida.");
    }

    /**
     * Apaga el sistema de climatización.
     */
    @Override
    public void apagar() {
        System.out.println("Climatización Clase C: Apagada.");
    }

    /**
     * Ajusta la temperatura del sistema de climatización.
     * 
     * @param incremento la cantidad en grados Celsius por la que se ajustará la temperatura.
     */
    @Override
    public void ajustarTemperatura(int incremento) {
        this.temperatura += incremento;
        System.out.println("Temperatura ajustada a: " + this.temperatura + "°C");
    }

    /**
     * Ajusta el nivel de ventilación del sistema de climatización.
     * 
     * @param nivel el nuevo nivel de ventilación.
     */
    @Override
    public void ajustarVentilacion(int nivel) {
        this.ventilacion = nivel;
        System.out.println("Nivel de ventilación ajustado a: " + this.ventilacion);
    }

    /**
     * Indica que el modo automático no está disponible en esta clase de climatización.
     * 
     * @param temperaturaExterior la temperatura exterior en grados Celsius (no es usado en esta clase).
     */
    @Override
    public void activarModoAutomático(int temperaturaExterior) {
        System.out.println("Modo automático no disponible en esta clase.");
    }

    /**
     * Activa el desempañador manual del parabrisas.
     */
    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador manual del parabrisas.");
        this.desempañadoActivo = true;
    }

    /**
     * Indica que el modo de desempañador acelerado no está disponible en esta clase.
     */
    @Override
    public void activarModoAcelerado() {
        System.out.println("Modo de desempañador acelerado no disponible en esta clase.");
    }

    /**
     * Desactiva el desempañador.
     */
    @Override
    public void desactivarDesempañador() {
        System.out.println("Desactivando desempañador.");
        this.desempañadoActivo = false;
    }

    /**
     * Muestra los indicadores actuales del sistema de climatización, incluyendo la temperatura 
     * y el nivel de ventilación.
     */
    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización C:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
    }

    /**
     * Activa el modo económico para reducir el consumo energético.
     */
    public void modoEconómico() {
        System.out.println("Activando modo económico para reducir consumo energético.");
    }

    /**
     * Muestra un recordatorio si el desempañador ha estado activado durante mucho tiempo.
     */
    public void recordatorio() {
        System.out.println("Recordatorio: El desempañador ha estado activado por mucho tiempo.");
    }

    /**
     * Indica que la opción de espejos laterales no está disponible en esta clase de climatización.
     */
    @Override
    public void activarEspejosLaterales() {
        System.out.println("Opción no disponible en esta gama.");
    }
}
