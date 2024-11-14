package clases;

import interfaces.Climatizacion;

/**
 * Clase que implementa la interfaz Climatizacion y representa un sistema de climatización 
 * de tipo A con funcionalidades de control de temperatura, ventilación y desempañador.
 * Autores: Javier Alvarado y Angel Sanabria
 *
 * Fecha de creación: 11 de noviembre del 2024
 * Fecha de modificación: 13 de noviembre del 2024
 */
public class ClimatizacionA implements Climatizacion {

    private boolean desempañadoActivo;
    private double nivelHumedad;
    private boolean modoAceleradoActivo;
    private boolean modoAutomaticoActivo;
    private int temperatura;
    private int ventilacion;

    /**
     * Constructor por defecto que inicializa los valores predeterminados del sistema de climatización.
     */
    public ClimatizacionA() {
        this.desempañadoActivo = false;
        this.nivelHumedad = 50.0;  // Humedad inicial
        this.modoAceleradoActivo = false;
        this.modoAutomaticoActivo = false;
        this.temperatura = 22;  // Temperatura inicial en grados Celsius
        this.ventilacion = 3;  // Nivel de ventilación inicial
    }

    /**
     * Enciende el sistema de climatización.
     */
    @Override
    public void encender() {
        System.out.println("Climatización Clase A: Encendida.");
    }

    /**
     * Apaga el sistema de climatización.
     */
    @Override
    public void apagar() {
        System.out.println("Climatización Clase A: Apagada.");
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
     * Activa el modo automático, ajustando el sistema en función de la temperatura exterior.
     * 
     * @param temperaturaExterior la temperatura exterior en grados Celsius.
     */
    @Override
    public void activarModoAutomático(int temperaturaExterior) {
        this.modoAutomaticoActivo = true;
        System.out.println("Modo automático activado. Temperatura exterior: " + temperaturaExterior + "°C");
    }

    /**
     * Activa el desempañador automático.
     */
    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador automático inteligente.");
        this.desempañadoActivo = true;
    }

    /**
     * Activa el modo de desempañador acelerado.
     */
    @Override
    public void activarModoAcelerado() {
        System.out.println("Activando modo de desempañador acelerado.");
        this.modoAceleradoActivo = true;
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
     * Muestra los indicadores actuales del sistema de climatización.
     */
    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización A:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
        System.out.println("Humedad: " + this.nivelHumedad + "%");
        System.out.println("Modo Acelerado: " + (this.modoAceleradoActivo ? "Activado" : "Desactivado"));
    }

    /**
     * Activa los espejos laterales en el sistema de climatización.
     */
    @Override
    public void activarEspejosLaterales() {
        System.out.println("Activando los espejos laterales en Climatización A...");
    }

    /**
     * Controla una zona específica para el desempañado.
     * 
     * @param zona la zona que se va a controlar.
     */
    public void controlarZona(String zona) {
        System.out.println("Controlando zona de desempañado: " + zona);
    }
}
