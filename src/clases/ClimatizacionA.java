package clases;

import interfaces.Climatizacion;

public class ClimatizacionA implements Climatizacion {

    private boolean desempañadoActivo;
    private double nivelHumedad;
    private boolean modoAceleradoActivo;
    private boolean modoAutomaticoActivo;
    private int temperatura;
    private int ventilacion;

    public ClimatizacionA() {
        this.desempañadoActivo = false;
        this.nivelHumedad = 50.0;  // Humedad inicial
        this.modoAceleradoActivo = false;
        this.modoAutomaticoActivo = false;
        this.temperatura = 22;  // Temperatura inicial en grados Celsius
        this.ventilacion = 3;  // Nivel de ventilación inicial
    }

    @Override
    public void encender() {
        System.out.println("Climatización Clase A: Encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Climatización Clase A: Apagada.");
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
        this.modoAutomaticoActivo = true;
        System.out.println("Modo automático activado. Temperatura exterior: " + temperaturaExterior + "°C");
    }

    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador automático inteligente.");
        this.desempañadoActivo = true;
    }

    @Override
    public void activarModoAcelerado() {
        System.out.println("Activando modo de desempañador acelerado.");
        this.modoAceleradoActivo = true;
    }

    @Override
    public void desactivarDesempañador() {
        System.out.println("Desactivando desempañador.");
        this.desempañadoActivo = false;
    }

    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización A:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
        System.out.println("Humedad: " + this.nivelHumedad + "%");
        System.out.println("Modo Acelerado: " + (this.modoAceleradoActivo ? "Activado" : "Desactivado"));
    }

    @Override
    public void activarEspejosLaterales() {
        System.out.println("Activando los espejos laterales en Climatización A...");
    }

    public void controlarZona(String zona) {
        System.out.println("Controlando zona de desempañado: " + zona);
    }
}
