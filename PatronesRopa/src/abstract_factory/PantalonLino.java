package abstract_factory;

/** Pantalon de lino - Temporada Calida */
public class PantalonLino implements Pantalon {
    @Override
    public void mostrar() {
        System.out.println("[TEMPORADA CALIDA] Pantalon de lino fresco - clima templado");
    }
    @Override public String getTipo() { return "Lino transpirable"; }
}
