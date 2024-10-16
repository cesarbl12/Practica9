public class Carro extends MedioDeTransporteMecanico {

    public Carro(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("Carro avanzando.");
    }

    @Override
    public void retroceder() {
        System.out.println("Carro retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println("El carro esta girando.");
    }
}
