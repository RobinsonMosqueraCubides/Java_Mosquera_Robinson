public class ClienteVIP extends Cliente{
    public ClienteVIP(String nombre, String apellido1, String cc, String telefono) {
        super(nombre, apellido1, cc, telefono);
    }

    @Override
    public String getTipoCliente() {
        return "VIP";
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        return Descuentos.VIP.aplicarDescuento(montoTotal);
    }
}
