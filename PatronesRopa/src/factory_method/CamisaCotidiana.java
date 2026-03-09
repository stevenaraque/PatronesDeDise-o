package factory_method;

/**
 * Producto concreto: Camisa - Patron Factory Method
 * Almacen Don Jose de Chiquinquira
 */
public class CamisaCotidiana extends PrendaBoyacense {

    public CamisaCotidiana() {
        this.nombre   = "Camisa artesanal boyacense";
        this.precio   = 45000;
        this.material = "Algodon nacional";
    }

    @Override
    public void describir() {
        System.out.println("Prenda   : " + nombre);
        System.out.println("Material : " + material);
        System.out.println("Precio   : $" + precio);
    }
}
