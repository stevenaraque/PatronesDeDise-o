package factory_method;

/**
 * Creador abstracto con Factory Method declarado
 * Almacen Don Jose de Chiquinquira
 */
public abstract class TiendaRopa {

    // Este es el Factory Method - las subclases deciden que objeto crear
    public abstract PrendaBoyacense crearPrenda(String tipo);

    // Metodo de negocio que usa el factory method
    public void venderPrenda(String tipo) {
        System.out.println("=== Procesando venta en Almacen Don Jose ===");
        PrendaBoyacense prenda = crearPrenda(tipo);
        prenda.describir();
        System.out.println("--- Venta registrada exitosamente. ---\n");
    }

    public double consultarPrecio(String tipo) {
        return crearPrenda(tipo).getPrecio();
    }
}
