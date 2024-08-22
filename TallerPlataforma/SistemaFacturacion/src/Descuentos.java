public enum Descuentos {
    REGULAR(0.10),
    VIP(0.15);

    private final double porcentaje;

    Descuentos(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double montoTotal) {
        return montoTotal * (1 - porcentaje);
    }
}
