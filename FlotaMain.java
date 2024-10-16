import java.util.ArrayList;
import java.util.Date;

public class FlotaMain {
    public static void main(String[] args) {
        Flota flota = new Flota();

        // Crear un medio de transporte de cada tipo
        Bicicleta bici = new Bicicleta("Bicicleta de montaña", "B001", 2018);
        Caballo caballo = new Caballo("Caballo de carreras", "C001", 2015);
        Carro carro = new Carro("Honda CITY","M1202",2024 );
        Camello camello = new Camello("Camello del desierto", "0000", 2025);

        // Crear mantenimientos
        Mantenimiento mantenimientoBici = new Mantenimiento("Ajuste de frenos", new Date(), 30);
        Mantenimiento mantenimientoCaballo = new Mantenimiento("Revisión de herraduras", new Date(), 50);
        Mantenimiento mantenimientoCarro = new Mantenimiento("Cambio de balatas", new Date(), 25);
        Mantenimiento mantenimientoCamello = new Mantenimiento("Desparasitacion", new Date(), 1200);

        // Agregar mantenimientos
        bici.agregarMantenimiento(mantenimientoBici);
        caballo.agregarMantenimiento(mantenimientoCaballo);
        carro.agregarMantenimiento(mantenimientoCarro);
        camello.agregarMantenimiento(mantenimientoCamello);

        // Agregar medios a la flota
        flota.agregarMedio(bici);
        flota.agregarMedio(caballo);
        flota.agregarMedio(carro);
        flota.agregarMedio(camello);

        // Invocar los métodos
        bici.avanzar();
        caballo.avanzar();
        carro.avanzar();
        camello.virar();
        bici.virar();
        caballo.virar();
        carro.retroceder();
        camello.avanzar();

        flota.mostrarMedios();
    }
}
