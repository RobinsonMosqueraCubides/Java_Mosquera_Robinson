import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = productos.stream().mapToDouble(Producto::getPrecio).sum();
        return cliente.aplicarDescuento(total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura para ").append(cliente).append("\n");
        productos.forEach(p -> sb.append(p).append("\n"));
        sb.append("Total: $").append(calcularTotal()).append("\n");
        return sb.toString();
    }
}
