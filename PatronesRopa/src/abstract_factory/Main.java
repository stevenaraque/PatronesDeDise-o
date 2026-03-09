package abstract_factory;

/**
 * Clase de prueba - Patron Abstract Factory
 * Almacen Don Jose de Chiquinquira
 *
 * Para compilar y ejecutar:
 *   javac abstract_factory/*.java
 *   java abstract_factory.Main
 */
public class Main {

    static void mostrarColeccion(FabricaRopaBoyacense fabrica, String temporada) {
        System.out.println("=== Coleccion: " + temporada + " ===");
        Ruana    r = fabrica.crearRuana();
        Pantalon p = fabrica.crearPantalon();
        r.mostrar();
        p.mostrar();
        System.out.println("Material ruana  : " + r.getMaterial());
        System.out.println("Tipo pantalon   : " + p.getTipo());
        System.out.println();
    }

    public static void main(String[] args) {
        mostrarColeccion(new FabricaTemporadaFria(),   "TEMPORADA FRIA");
        mostrarColeccion(new FabricaTemporadaCalida(), "TEMPORADA CALIDA");
    }
}
