package abstract_factory;

/** Ruana de algodon - Temporada Calida */
public class RuanaAlgodon implements Ruana {
    @Override
    public void mostrar() {
        System.out.println("[TEMPORADA CALIDA] Ruana ligera de algodon - para clima templado de Boyaca");
    }
    @Override public String getMaterial() { return "Algodon nacional liviano"; }
}
