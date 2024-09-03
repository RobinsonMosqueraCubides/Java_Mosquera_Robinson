/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligabaloncesto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author Robinson Mosquera
 */
public class LigaBaloncesto {
    private static ArrayList<Partido> partidos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Gestión de Partidos:");
            System.out.println("1. Registrar Partido de Liga");
            System.out.println("2. Registrar Partido de PlayOffs");
            System.out.println("3. Finalizar Partido");
            System.out.println("4. Registrar Equipo");
            System.out.println("5. Mostrar Información del Partido");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPartidoLiga(scanner);
                    break;
                case 2:
                    registrarPartidoPlayOffs(scanner);
                    break;
                case 3:
                    finalizarPartido(scanner);
                    break;
                case 4:
                    DDBB(scanner);
                    break;
                case 5:
                    mostrarInformacionPartido(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void DDBB(Scanner scanner){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String url = "jdbc:mysql://172.16.101.164:3306/ligaBaloncesto";
        String username = "root";
        String password = "1095827105";
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            connection = DriverManager.getConnection(url, username, password);
            
            String sql = "INSERT INTO Equipo (Nombre, Lugar) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(sql);
            
            System.out.println("Ingrese el nombre del equipo");
            preparedStatement.setString(1, scanner.next());
            System.out.println("Ingrese el Lugar");
            preparedStatement.setString(2, scanner.next());
             // Ejecutar la consulta
            int rowsAffected = preparedStatement.executeUpdate();

            // Comprobar si la inserción fue exitosa
            if (rowsAffected > 0) {
                System.out.println("Datos insertados exitosamente!");
            } else {
                System.out.println("No se insertaron datos.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar o insertar datos: " + e.getMessage());
        } finally {
            try {
                // Cerrar el PreparedStatement y la conexión
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    
    private static void registrarPartidoLiga(Scanner scanner) {
        System.out.println("Registrar Partido de Liga:");
        System.out.print("Equipo Local: ");
        String equipoLocal = scanner.next();
        System.out.print("Equipo Visitante: ");
        String equipoVisitante = scanner.next();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fechaStr = scanner.next();
        Date fecha = Date.from(java.time.LocalDate.parse(fechaStr).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        System.out.print("Número de Jornada: ");
        int numeroJornada = scanner.nextInt();

        Partido partido = new PartidoLiga(equipoLocal, equipoVisitante, fecha, numeroJornada);
        partidos.add(partido);
    }

    private static void registrarPartidoPlayOffs(Scanner scanner) {
        System.out.println("Registrar Partido de PlayOffs:");
        System.out.print("Equipo Local: ");
        String equipoLocal = scanner.next();
        System.out.print("Equipo Visitante: ");
        String equipoVisitante = scanner.next();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fechaStr = scanner.next();
        Date fecha = Date.from(java.time.LocalDate.parse(fechaStr).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        System.out.print("Ronda (e.g., octavos, cuartos, final): ");
        String ronda = scanner.next();

        Partido partido = new PartidoPlayOffs(equipoLocal, equipoVisitante, fecha, ronda);
        partidos.add(partido);
    }

    private static void finalizarPartido(Scanner scanner) {
        System.out.println("Finalizar Partido:");
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < partidos.size()) {
            System.out.println("puntos de "+ partidos.get(indice).getEquipoLocal()+":");
            partidos.get(indice).registrarPuntosLocal(Integer.parseInt(scanner.next()));
            System.out.println("puntos de "+ partidos.get(indice).getEquipoVisitante());
            partidos.get(indice).registrarPuntosVisitante(Integer.parseInt(scanner.next()));
            partidos.get(indice).finalizarPartido();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void mostrarInformacionPartido(Scanner scanner) {
        System.out.println("Mostrar Información del Partido:");
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < partidos.size()) {
            partidos.get(indice).mostrarInformacion();
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
}
