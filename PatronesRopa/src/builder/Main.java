package builder;

/**
 * Clase de prueba - Patron Builder
 * Almacen Don Jose de Chiquinquira
 *
 * Para compilar y ejecutar:
 *   javac builder/*.java
 *   java builder.Main
 */
public class Main {
    public static void main(String[] args) {

        // Pedido completo con todas las opciones
        PedidoRopa pedido1 = new PedidoRopa.Builder()
            .cliente("Maria Paez")
            .prenda("Ruana de lana Nobsa")
            .talla("M")
            .color("Cafe oscuro")
            .conDomicilio()
            .notaEspecial("Envolver para regalo de cumpleanos")
            .formaPago("Nequi")
            .descuento(0.10)
            .build();

        // Pedido minimo (solo campos obligatorios)
        PedidoRopa pedido2 = new PedidoRopa.Builder()
            .cliente("Jose Rincon")
            .prenda("Camisa artesanal boyacense")
            .talla("L")
            .color("Blanco hueso")
            .build();

        // Pedido intermedio
        PedidoRopa pedido3 = new PedidoRopa.Builder()
            .cliente("Ana Rodriguez")
            .prenda("Poncho infantil")
            .talla("S")
            .color("Verde")
            .formaPago("Tarjeta")
            .conDomicilio()
            .build();

        System.out.println(pedido1);
        System.out.println();
        System.out.println(pedido2);
        System.out.println();
        System.out.println(pedido3);
    }
}
