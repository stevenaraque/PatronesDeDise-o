package factory_method;

/**
 * Producto abstracto - Patron Factory Method
 * Sistema de Gestion - Almacen Don Jose de Chiquinquira
 */
public abstract class PrendaBoyacense {
    protected String nombre;
    protected double precio;
    protected String material;

    public abstract void describir();

    public String getNombre()   { return nombre; }
    public double getPrecio()   { return precio; }
    public String getMaterial() { return material; }
}
