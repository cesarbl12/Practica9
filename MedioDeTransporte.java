import java.util.ArrayList;

public abstract class MedioDeTransporte {
    protected String nombre;
    private String identificador;
    private int anioCreacion;
    private ArrayList<Mantenimiento> historialMantenimiento;

    public MedioDeTransporte(String nombre, String identificador, int anioCreacion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.anioCreacion = anioCreacion;
        this.historialMantenimiento = new ArrayList<>();
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimiento.add(mantenimiento);
    }

    public void agregarMantenimientos(ArrayList<Mantenimiento> mantenimientos) {
        historialMantenimiento.addAll(mantenimientos);
    }

    public ArrayList<Mantenimiento> getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    // Métodos getter para los atributos
    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getAnioDeCreacion() {
        return anioCreacion;
    }

    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();
}
