package mvc;

/**
 * Clase de prueba - Patron MVC
 * Almacen Don Jose de Chiquinquira
 *
 * Para compilar y ejecutar:
 *   javac mvc/*.java
 *   java mvc.Main
 */
public class Main {
    public static void main(String[] args) {

        // MODELO: datos del producto
        Producto ruana = new Producto("Ruana lana Nobsa", 85000, 30, "Prendas tipicas");

        // VISTA: como se muestra al usuario
        VistaInventario vista = new VistaInventario();

        // CONTROLADOR: coordina modelo y vista
        ControladorInventario ctrl = new ControladorInventario(ruana, vista);

        // Simula peticion GET /inventario
        ctrl.consultarInventario();

        // Simula peticion POST /inventario?accion=vender&cantidad=5
        ctrl.procesarVenta(5);

        // Intento de venta con stock insuficiente
        ctrl.procesarVenta(100);

        // Simula actualizacion de precio (admin)
        ctrl.actualizarPrecio(90000);
    }
}
