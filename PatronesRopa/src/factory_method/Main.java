package factory_method;

/**
 * Clase de prueba - Patron Factory Method
 * Almacen Don Jose de Chiquinquira
 *
 * Para compilar y ejecutar desde la carpeta raiz del proyecto:
 *   javac factory_method/*.java
 *   java factory_method.Main
 */
public class Main {
    public static void main(String[] args) {
        TiendaRopa tienda = new AlmacenDonJose();

        // El cliente solo pide el tipo - el almacen crea el objeto correcto
        tienda.venderPrenda("ruana");
        tienda.venderPrenda("camisa");

        // Consultar precio sin crear objeto completo
        System.out.println("Precio consulta ruana: $" + tienda.consultarPrecio("ruana"));
    }
}
