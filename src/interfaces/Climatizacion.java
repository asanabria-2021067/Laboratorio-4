package interfaces;

public interface Climatizacion {
    void encender();
    void apagar();
    void ajustarTemperatura(int incremento);
    void ajustarVentilacion(int nivel);
    void activarModoAutomático(int temperaturaExterior);
    void activarDesempañador();
    void activarModoAcelerado();
    void desactivarDesempañador();
    void mostrarIndicadores();
    void activarEspejosLaterales();
}
