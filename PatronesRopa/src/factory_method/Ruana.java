package factory_method;

/**
 * Producto concreto: Ruana - Patron Factory Method
 * Almacen Don Jose de Chiquinquira
 */
public class Ruana extends PrendaBoyacense {

    public Ruana() {
        this.nombre   = "Ruana tradicional Nobsa";
        this.precio   = 85000;
        this.material = "Lana de oveja";
    }

    @Override
    public void describir() {
        System.out.println("Prenda   : " + nombre);
        System.out.println("Material : " + material);
        System.out.println("Precio   : $" + precio);
        System.out.println("Origen   : Artesanos de Nobsa, Boyaca");
    }
}
