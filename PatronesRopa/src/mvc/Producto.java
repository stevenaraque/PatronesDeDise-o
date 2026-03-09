package mvc;

/**
 * MODELO - Datos del producto
 * Patron MVC - Almacen Don Jose de Chiquinquira
 * En una aplicacion real conectaria con la base de datos via DAO
 */
public class Producto {
    private String nombre;
    private double precio;
    private int    cantidad;
    private String categoria;

    public Producto(String nombre, double precio, int cantidad, String categoria) {
        this.nombre    = nombre;
        this.precio    = precio;
        this.cantidad  = cantidad;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getNombre()   { return nombre; }
    public double getPrecio()   { return precio; }
    public int    getCantidad() { return cantidad; }
    public String getCategoria(){ return categoria; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecio(double precio)  { this.precio   = precio; }
}
