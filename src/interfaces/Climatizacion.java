package interfaces;

/**
 * Interfaz que define los métodos comunes para el control de sistemas de climatización en vehículos,
 * incluyendo el ajuste de temperatura, ventilación, modos de desempañador, y más.
 * Las clases que implementen esta interfaz deben proporcionar su propia implementación de los métodos.
 * Autores: Javier Alvarado y Angel Sanabria
 * 
 * Fecha de creación: 11 de noviembre del 2024
 * Fecha de modificación: 13 de noviembre del 2024
 */
public interface Climatizacion {

    /**
     * Enciende el sistema de climatización.
     */
    void encender();

    /**
     * Apaga el sistema de climatización.
     */
    void apagar();

    /**
     * Ajusta la temperatura del sistema de climatización.
     * 
     * @param incremento la cantidad en grados Celsius por la que se ajustará la temperatura.
     */
    void ajustarTemperatura(int incremento);

    /**
     * Ajusta el nivel de ventilación del sistema de climatización.
     * 
     * @param nivel el nuevo nivel de ventilación.
     */
    void ajustarVentilacion(int nivel);

    /**
     * Activa el modo automático del sistema de climatización, que ajusta la configuración según la temperatura exterior.
     * 
     * @param temperaturaExterior la temperatura exterior en grados Celsius.
     */
    void activarModoAutomático(int temperaturaExterior);

    /**
     * Activa el desempañador del sistema de climatización.
     */
    void activarDesempañador();

    /**
     * Activa el modo acelerado del desempañador, aumentando su eficiencia.
     */
    void activarModoAcelerado();

    /**
     * Desactiva el desempañador del sistema de climatización.
     */
    void desactivarDesempañador();

    /**
     * Muestra los indicadores actuales del sistema de climatización, como temperatura, ventilación, y otros parámetros.
     */
    void mostrarIndicadores();

    /**
     * Activa los espejos laterales del vehículo, si está disponible.
     */
    void activarEspejosLaterales();
}
