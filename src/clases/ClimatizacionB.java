package clases;

import interfaces.Climatizacion;

/**
 * Clase que implementa la interfaz Climatizacion y representa un sistema de climatización 
 * de tipo B con funcionalidades de control de temperatura, ventilación y modos de desempañador.
 * Autores: Javier Alvarado y Angel Sanabria
 * 
 *
 * Fecha de creación: 11 de noviembre del 2024
 * Fecha de modificación: 13 de noviembre del 2024
 */
public class ClimatizacionB implements Climatizacion {

    private boolean desempañadoActivo;
    private boolean modoAceleradoActivo;
    private int temperatura;
    private int ventilacion;

    /**
     * Constructor por defecto que inicializa los valores predeterminados del sistema de climatización.
     */
    public ClimatizacionB() {
        this.desempañadoActivo = false;
        this.modoAceleradoActivo = false;
        this.temperatura = 22;  // Temperatura inicial en grados Celsius
        this.ventilacion = 3;  // Nivel de ventilación inicial
    }

    /**
     * Enciende el sistema de climatización.
     */
    @Override
    public void encender() {
        System.out.println("Climatización Clase B: Encendida.");
    }

    /**
     * Apaga el sistema de climatización.
     */
    @Override
    public void apagar() {
        System.out.println("Climatización Clase B: Apagada.");
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
     * Activa el modo automático del sistema, ajustando la configuración en función de la temperatura exterior.
     * 
     * @param temperaturaExterior la temperatura exterior en grados Celsius.
     */
    @Override
    public void activarModoAutomático(int temperaturaExterior) {
        System.out.println("Modo automático activado. Temperatura exterior: " + temperaturaExterior + "°C");
    }

    /**
     * Activa el desempañador automático.
     */
    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador automático.");
        this.desempañadoActivo = true;
    }

    /**
     * Activa el modo rápido de desempañador.
     */
    @Override
    public void activarModoAcelerado() {
        System.out.println("Activando modo rápido de desempañador.");
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
     * Muestra los indicadores actuales del sistema de climatización, incluyendo la temperatura, 
     * nivel de ventilación y estado del modo acelerado.
     */
    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización B:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
        System.out.println("Modo Acelerado: " + (this.modoAceleradoActivo ? "Activado" : "Desactivado"));
    }

    /**
     * Activa los espejos laterales en el sistema de climatización.
     */
    @Override
    public void activarEspejosLaterales() {
        System.out.println("Activando los espejos laterales en Climatización B...");
    }

    /**
     * Desactiva automáticamente el desempañador.
     */
    public void desactivarAutomatica() {
        System.out.println("Desactivación automática del desempañador.");
    }
}
