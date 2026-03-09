package abstract_factory;

/** Pantalon termico - Temporada Fria */
public class PantalonTermico implements Pantalon {
    @Override
    public void mostrar() {
        System.out.println("[TEMPORADA FRIA] Pantalon termico para clima frio boyacense");
    }
    @Override public String getTipo() { return "Termico forrado"; }
}
