package clases;

import interfaces.Climatizacion;

public class ClimatizacionC implements Climatizacion {

    private boolean desempañadoActivo;
    private int temperatura;
    private int ventilacion;

    public ClimatizacionC() {
        this.desempañadoActivo = false;
        this.temperatura = 22;
        this.ventilacion = 2;  // Menor nivel de ventilación en comparación con las otras clases
    }

    @Override
    public void encender() {
        System.out.println("Climatización Clase C: Encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Climatización Clase C: Apagada.");
    }

    @Override
    public void ajustarTemperatura(int incremento) {
        this.temperatura += incremento;
        System.out.println("Temperatura ajustada a: " + this.temperatura + "°C");
    }

    @Override
    public void ajustarVentilacion(int nivel) {
        this.ventilacion = nivel;
        System.out.println("Nivel de ventilación ajustado a: " + this.ventilacion);
    }

    @Override
    public void activarModoAutomático(int temperaturaExterior) {
        System.out.println("Modo automático no disponible en esta clase.");
    }

    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador manual del parabrisas.");
        this.desempañadoActivo = true;
    }

    @Override
    public void activarModoAcelerado() {
        System.out.println("Modo de desempañador acelerado no disponible en esta clase.");
    }

    @Override
    public void desactivarDesempañador() {
        System.out.println("Desactivando desempañador.");
        this.desempañadoActivo = false;
    }

    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización C:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
    }

    // Funcionalidades específicas de la Clase C
    public void modoEconómico() {
        System.out.println("Activando modo económico para reducir consumo energético.");
    }

    public void recordatorio() {
        System.out.println("Recordatorio: El desempañador ha estado activado por mucho tiempo.");
    }
    @Override
    public void activarEspejosLaterales() {
        System.out.println("Opcion no disponible en esta gama");
    }
}
