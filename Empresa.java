public class Empresa{
    private String nombre;
    private Flota flota;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.flota= new Flota();
    }

    public Flota getFlota(){
        return flota;
    }

    public String getNombre(){
        return nombre;
    }

    
    public void agregarMedioTransporte(MedioDeTransporte medio){
        flota.agregarMedio(medio);
    }

    
}