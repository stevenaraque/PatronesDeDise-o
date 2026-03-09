package abstract_factory;

/** Ruana de lana - Temporada Fria */
public class RuanaLana implements Ruana {
    @Override
    public void mostrar() {
        System.out.println("[TEMPORADA FRIA] Ruana de lana gruesa - ideal para el paramo boyacense");
    }
    @Override public String getMaterial() { return "Lana de oveja gruesa"; }
}
