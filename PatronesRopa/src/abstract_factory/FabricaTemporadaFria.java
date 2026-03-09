package abstract_factory;

/** Fabrica concreta para Temporada Fria */
public class FabricaTemporadaFria implements FabricaRopaBoyacense {
    @Override public Ruana    crearRuana()    { return new RuanaLana(); }
    @Override public Pantalon crearPantalon() { return new PantalonTermico(); }
}
