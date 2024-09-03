public abstract class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cc;
    private String telefono;

    public Cliente(String nombre, String apellido1, String cc, String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.cc = cc;
        this.telefono = telefono;
    }
    public abstract String getTipoCliente();
    public abstract double aplicarDescuento(double montoTotal);

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCc() {
        return cc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", cc='" + cc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
