package builder;

/**
 * Producto complejo: Pedido de ropa con Builder interno
 * Patron Builder - Almacen Don Jose de Chiquinquira
 */
public class PedidoRopa {

    // Campos del pedido (algunos obligatorios, otros opcionales)
    private final String cliente;
    private final String prenda;
    private final String talla;
    private final String color;
    private final boolean envioADomicilio;
    private final String notaEspecial;
    private final String formaPago;
    private final double descuento;

    // Constructor privado: solo el Builder puede instanciar
    private PedidoRopa(Builder b) {
        this.cliente         = b.cliente;
        this.prenda          = b.prenda;
        this.talla           = b.talla;
        this.color           = b.color;
        this.envioADomicilio = b.envioADomicilio;
        this.notaEspecial    = b.notaEspecial;
        this.formaPago       = b.formaPago;
        this.descuento       = b.descuento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("============================\n");
        sb.append(" PEDIDO ALMACEN DON JOSE    \n");
        sb.append("============================\n");
        sb.append("Cliente      : ").append(cliente).append("\n");
        sb.append("Prenda       : ").append(prenda).append("\n");
        sb.append("Talla        : ").append(talla).append("\n");
        sb.append("Color        : ").append(color).append("\n");
        sb.append("Forma pago   : ").append(formaPago).append("\n");
        if (descuento > 0)
            sb.append("Descuento    : ").append((int)(descuento*100)).append("%\n");
        if (envioADomicilio)
            sb.append("Envio        : A DOMICILIO\n");
        if (notaEspecial != null)
            sb.append("Nota         : ").append(notaEspecial).append("\n");
        sb.append("============================");
        return sb.toString();
    }

    // ===================== BUILDER INTERNO =====================
    public static class Builder {
        // Obligatorios
        private String cliente;
        private String prenda;
        private String talla;
        private String color;

        // Opcionales con defaults
        private boolean envioADomicilio = false;
        private String  notaEspecial    = null;
        private String  formaPago       = "Efectivo";
        private double  descuento       = 0.0;

        public Builder cliente(String cliente)    { this.cliente = cliente;   return this; }
        public Builder prenda(String prenda)      { this.prenda  = prenda;    return this; }
        public Builder talla(String talla)        { this.talla   = talla;     return this; }
        public Builder color(String color)        { this.color   = color;     return this; }
        public Builder conDomicilio()             { this.envioADomicilio = true; return this; }
        public Builder notaEspecial(String nota)  { this.notaEspecial = nota; return this; }
        public Builder formaPago(String pago)     { this.formaPago = pago;    return this; }
        public Builder descuento(double desc)     { this.descuento = desc;    return this; }

        public PedidoRopa build() {
            if (cliente == null || prenda == null || talla == null || color == null)
                throw new IllegalStateException("Cliente, prenda, talla y color son obligatorios.");
            return new PedidoRopa(this);
        }
    }
}
