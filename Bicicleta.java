public class Bicicleta extends MedioDeTransporteMecanico {

    public Bicicleta(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza.");
    }

    @Override
    public void retroceder() {
        System.out.println("La bicicleta retrocede.");
    }

    @Override
    public void virar() {
        System.out.println("La bicicleta gira.");
    }
}
