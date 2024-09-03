public class ClienteRegular extends  Cliente{
    public ClienteRegular(String nombre, String apellido1, String cc, String telefono) {
        super(nombre, apellido1, cc, telefono);
    }

    @Override
    public String getTipoCliente() {
        return "REGULAR";
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        return Descuentos.REGULAR.aplicarDescuento(montoTotal);
    }
}
