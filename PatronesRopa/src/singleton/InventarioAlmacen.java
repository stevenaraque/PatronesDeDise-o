package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton: Inventario unico del Almacen Don Jose
 * Patron Singleton con double-checked locking (thread-safe)
 * Almacen Don Jose de Chiquinquira, Boyaca
 */
public class InventarioAlmacen {

    // Instancia unica - volatile para visibilidad en multiples hilos
    private static volatile InventarioAlmacen instancia;

    // Datos del inventario
    private final Map<String, Integer> stock;
    private final Map<String, Double>  precios;

    // Constructor PRIVADO - nadie puede usar "new" desde fuera
    private InventarioAlmacen() {
        stock   = new HashMap<>();
        precios = new HashMap<>();

        // Stock inicial del almacen
        stock.put("Ruana lana Nobsa",      30);
        stock.put("Camisa artesanal",      50);
        stock.put("Poncho infantil",       20);
        stock.put("Pantalon de lino",      15);

        precios.put("Ruana lana Nobsa",     85000.0);
        precios.put("Camisa artesanal",     45000.0);
        precios.put("Poncho infantil",      35000.0);
        precios.put("Pantalon de lino",     60000.0);

        System.out.println("[Singleton] Inventario inicializado - Almacen Don Jose de Chiquinquira");
    }

    // Punto de acceso global con doble verificacion thread-safe
    public static InventarioAlmacen getInstance() {
        if (instancia == null) {
            synchronized (InventarioAlmacen.class) {
                if (instancia == null) {
                    instancia = new InventarioAlmacen();
                }
            }
        }
        return instancia;
    }

    public void agregarStock(String prenda, int cantidad) {
        stock.merge(prenda, cantidad, Integer::sum);
        System.out.println("[Inventario] Stock actualizado: " + prenda
            + " -> " + stock.get(prenda) + " unidades");
    }

    public boolean vender(String prenda, int cantidad) {
        int actual = stock.getOrDefault(prenda, 0);
        if (actual >= cantidad) {
            stock.put(prenda, actual - cantidad);
            double total = precios.getOrDefault(prenda, 0.0) * cantidad;
            System.out.printf("[Venta] %dx %s vendidas. Total: $%.0f%n", cantidad, prenda, total);
            return true;
        }
        System.out.println("[ERROR] Stock insuficiente para: " + prenda
            + " (disponible: " + actual + ", solicitado: " + cantidad + ")");
        return false;
    }

    public void mostrarInventario() {
        System.out.println("\n====== INVENTARIO - ALMACEN DON JOSE ======");
        stock.forEach((p, c) ->
            System.out.printf("  %-25s: %3d unidades  |  $%.0f c/u%n",
                p, c, precios.getOrDefault(p, 0.0)));
        System.out.println("==========================================\n");
    }
}
