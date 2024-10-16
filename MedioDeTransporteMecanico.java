public abstract class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        System.out.println(nombre + " encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println(nombre + " apagado.");
    }
}
