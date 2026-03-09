package abstract_factory;

/** Fabrica concreta para Temporada Calida */
public class FabricaTemporadaCalida implements FabricaRopaBoyacense {
    @Override public Ruana    crearRuana()    { return new RuanaAlgodon(); }
    @Override public Pantalon crearPantalon() { return new PantalonLino(); }
}
