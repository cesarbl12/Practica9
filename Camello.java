public class Camello extends MedioDeTransporteAnimal {

    public Camello(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("El camello avanza.");
    }

    @Override
    public void retroceder() {
        System.out.println("El camello retrocede.");
    }

    @Override
    public void virar() {
        System.out.println("El camello gira.");
    }
}
