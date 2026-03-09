package mvc;

/**
 * CONTROLADOR - Logica de negocio y coordinacion
 * Patron MVC - Almacen Don Jose de Chiquinquira
 *
 * En una aplicacion web real este seria un Servlet:
 *   @WebServlet("/inventario")
 *   public class InventarioServlet extends HttpServlet {
 *       protected void doGet(HttpServletRequest req, HttpServletResponse resp) {...}
 *       protected void doPost(HttpServletRequest req, HttpServletResponse resp) {...}
 *   }
 */
public class ControladorInventario {

    private final Producto        modelo;
    private final VistaInventario vista;

    public ControladorInventario(Producto modelo, VistaInventario vista) {
        this.modelo = modelo;
        this.vista  = vista;
    }

    /** Equivale a doGet() - consulta sin modificar datos */
    public void consultarInventario() {
        vista.mostrarEncabezado("Consulta de inventario");
        vista.mostrarProducto(modelo);
    }

    /** Equivale a doPost() - registra una venta */
    public void procesarVenta(int cantidad) {
        vista.mostrarEncabezado("Procesando venta");
        if (modelo.getCantidad() >= cantidad) {
            modelo.setCantidad(modelo.getCantidad() - cantidad);
            double total = modelo.getPrecio() * cantidad;
            vista.mostrarMensajeExito(
                "Venta de " + cantidad + " unidades. Total: $" + (int)total);
        } else {
            vista.mostrarMensajeError(
                "Stock insuficiente. Disponible: " + modelo.getCantidad());
        }
        vista.mostrarProducto(modelo);
    }

    /** Actualiza el precio del producto */
    public void actualizarPrecio(double nuevoPrecio) {
        vista.mostrarEncabezado("Actualizando precio");
        modelo.setPrecio(nuevoPrecio);
        vista.mostrarMensajeExito("Precio actualizado a $" + (int)nuevoPrecio);
        vista.mostrarProducto(modelo);
    }
}
