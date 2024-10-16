import java.util.ArrayList;

public class Flota {
    protected ArrayList<MedioDeTransporte> medios;

    public Flota(){
        this.medios = new ArrayList<>();
    }

    // Método para agregar un medio de transporte a la flota
    public void agregarMedio(MedioDeTransporte medio) {
        medios.add(medio);
    }

    // Método para agregar una lista de medios de transporte a la flota
    public void agregarMedios(ArrayList<MedioDeTransporte> nuevosMedios) {
        medios.addAll(nuevosMedios);
    }

    // Método para eliminar un medio de transporte de la flota
    public void eliminarMedio(MedioDeTransporte medio) {
        medios.remove(medio);
    }

    // Método para obtener la lista de medios de transporte
    public ArrayList<MedioDeTransporte> getMedios() {
        return medios;
    }

    // Método que retorna la cantidad de medios de transporte en la flota
    public int cantidadMedios() {
        return medios.size();
    }

    // Método para mostrar todos los medios de transporte en la flota
    public void mostrarMedios() {
        if (medios.isEmpty()) {
            System.out.println("No hay medios de transporte en la flota.");
        } else {
            System.out.println("Medios de transporte en la flota:");
            for (MedioDeTransporte medio : medios) {
                System.out.println("Nombre: " + medio.getNombre() + ", ID: " + medio.getIdentificador() + ", Año: " + medio.getAnioDeCreacion());
            }
        }
    }
}
