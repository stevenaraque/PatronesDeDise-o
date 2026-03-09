package mvc;

/**
 * VISTA - Presentacion del producto al usuario
 * Patron MVC - Almacen Don Jose de Chiquinquira
 * En una aplicacion web real este seria un archivo JSP:
 *   inventario.jsp mostrando ${producto.nombre}, ${producto.precio}, etc.
 */
public class VistaInventario {

    public void mostrarProducto(Producto p) {
        System.out.println("+----------------------------------+");
        System.out.printf("| Producto  : %-20s|%n", p.getNombre());
        System.out.printf("| Categoria : %-20s|%n", p.getCategoria());
        System.out.printf("| Precio    : $%-19.0f|%n", p.getPrecio());
        System.out.printf("| Stock     : %-16d uds |%n", p.getCantidad());
        System.out.println("+----------------------------------+");
    }

    public void mostrarMensajeExito(String mensaje) {
        System.out.println("[OK] " + mensaje);
    }

    public void mostrarMensajeError(String mensaje) {
        System.out.println("[ERROR] " + mensaje);
    }

    public void mostrarEncabezado(String titulo) {
        System.out.println("\n===== " + titulo.toUpperCase() + " =====");
    }
}
