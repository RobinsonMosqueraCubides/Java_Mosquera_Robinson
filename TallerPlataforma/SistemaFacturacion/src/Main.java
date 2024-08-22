import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear algunos productos
        Producto p1 = new Producto("Laptop", 1000);
        Producto p2 = new Producto("Mouse", 25);
        Producto p3 = new Producto("Teclado", 50);

        // Crear clientes
        Cliente c1 = new ClienteRegular("Juan","Perez","1238734","564334");
        Cliente c2 = new ClienteVIP("Ana", "Gómez", "8765432","44444");

        // Crear facturas
        Factura facturaVIP = new Factura(c2);
        facturaVIP.agregarProducto(p1);
        facturaVIP.agregarProducto(p2);
        facturaVIP.agregarProducto(p3);

        Factura facturaRegular = new Factura(c1);
        facturaRegular.agregarProducto(p1);
        facturaRegular.agregarProducto(p2);

        // Menú interactivo
        boolean running = true;
        while (running) {
            System.out.println("Menú:");
            System.out.println("1. Mostrar factura VIP");
            System.out.println("2. Mostrar factura Regular");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println(facturaVIP);
                    break;
                case 2:
                    System.out.println(facturaRegular);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
