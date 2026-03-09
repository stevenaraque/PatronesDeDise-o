package factory_method;

/**
 * Creador concreto - implementa el Factory Method
 * Almacen Don Jose de Chiquinquira, Boyaca
 */
public class AlmacenDonJose extends TiendaRopa {

    @Override
    public PrendaBoyacense crearPrenda(String tipo) {
        switch (tipo.toLowerCase()) {
            case "ruana":  return new Ruana();
            case "camisa": return new CamisaCotidiana();
            default:
                throw new IllegalArgumentException(
                    "Tipo de prenda no disponible: " + tipo);
        }
    }
}
