public class Caballo extends MedioDeTransporteAnimal {

    public Caballo(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("El caballo avanza.");
    }

    @Override
    public void retroceder() {
        System.out.println("El caballo retrocede.");
    }

    @Override
    public void virar() {
        System.out.println("El caballo gira.");
    }
}
