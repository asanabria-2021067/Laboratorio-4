package clases;

import interfaces.Climatizacion;

public class ClimatizacionB implements Climatizacion {

    private boolean desempañadoActivo;
    private boolean modoAceleradoActivo;
    private int temperatura;
    private int ventilacion;

    public ClimatizacionB() {
        this.desempañadoActivo = false;
        this.modoAceleradoActivo = false;
        this.temperatura = 22;
        this.ventilacion = 3;
    }

    @Override
    public void encender() {
        System.out.println("Climatización Clase B: Encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Climatización Clase B: Apagada.");
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
        System.out.println("Modo automático activado. Temperatura exterior: " + temperaturaExterior + "°C");
    }

    @Override
    public void activarDesempañador() {
        System.out.println("Activando desempañador automático.");
        this.desempañadoActivo = true;
    }

    @Override
    public void activarModoAcelerado() {
        System.out.println("Activando modo rápido de desempañador.");
        this.modoAceleradoActivo = true;
    }

    @Override
    public void desactivarDesempañador() {
        System.out.println("Desactivando desempañador.");
        this.desempañadoActivo = false;
    }

    @Override
    public void mostrarIndicadores() {
        System.out.println("Indicadores Climatización B:");
        System.out.println("Temperatura: " + this.temperatura + "°C");
        System.out.println("Ventilación: Nivel " + this.ventilacion);
        System.out.println("Modo Acelerado: " + (this.modoAceleradoActivo ? "Activado" : "Desactivado"));
    }

    @Override
    public void activarEspejosLaterales() {
        System.out.println("Activando los espejos laterales en Climatización B...");
    }

    public void desactivarAutomatica() {
        System.out.println("Desactivación automática del desempañador.");
    }
}
