import java.util.Date;

public class Mantenimiento {
    private String tipo;
    private Date fecha;
    private float costo;

    public Mantenimiento(String tipo, Date fecha, float costo) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getCosto() {
        return costo;
    }
}
