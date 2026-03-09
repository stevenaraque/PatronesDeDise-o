package singleton;

/**
 * Clase de prueba - Patron Singleton
 * Almacen Don Jose de Chiquinquira
 *
 * Para compilar y ejecutar:
 *   javac singleton/*.java
 *   java singleton.Main
 */
public class Main {
    public static void main(String[] args) {

        // Ambas referencias apuntan a la MISMA instancia
        InventarioAlmacen inventarioVendedor = InventarioAlmacen.getInstance();
        InventarioAlmacen inventarioAdmin    = InventarioAlmacen.getInstance();

        // Verificar que es la misma instancia
        System.out.println("Misma instancia: " + (inventarioVendedor == inventarioAdmin));

        // El vendedor vende productos
        inventarioVendedor.mostrarInventario();
        inventarioVendedor.vender("Ruana lana Nobsa", 5);
        inventarioVendedor.vender("Camisa artesanal", 3);

        // El admin ve el inventario actualizado automaticamente
        System.out.println("[Admin] Consultando inventario actual:");
        inventarioAdmin.mostrarInventario();

        // Agregar stock desde admin
        inventarioAdmin.agregarStock("Ruana lana Nobsa", 10);

        // Verificar desde la referencia del vendedor
        System.out.println("[Vendedor] Stock tras reposicion:");
        inventarioVendedor.mostrarInventario();

        // Intentar vender mas del stock disponible
        inventarioVendedor.vender("Poncho infantil", 100);
    }
}
