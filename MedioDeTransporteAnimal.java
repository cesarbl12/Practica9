public abstract class MedioDeTransporteAnimal extends MedioDeTransporte {

    public MedioDeTransporteAnimal(String nombre, String identificador, int anioCreacion) {
        super(nombre, identificador, anioCreacion);
    }

    public void preparar() {
        System.out.println(nombre + " está preparado.");
    }

    public void descansar() {
        System.out.println(nombre + " está descansando.");
    }
}
