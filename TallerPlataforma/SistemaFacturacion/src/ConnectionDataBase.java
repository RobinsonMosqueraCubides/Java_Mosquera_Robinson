import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    // Datos de conexión
    private static final String URL = "jdbc:mysql://bhiawskkhnsqmqf6m7yr-mysql.services.clever-cloud.com:3306/bhiawskkhnsqmqf6m7yr";
    private static final String USER = "uxwbmhp9uonikizx";
    private static final String PASSWORD = "0sWwvsis2ZaV1O09e8Q1";

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Crear la conexión a la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
            throw e;  // Relanzamos la excepción
        }

        return connection;
    }

    // Método para cerrar la conexión
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Prueba de conexión
        try {
            Connection connection = getConnection();
            // Aquí puedes realizar operaciones con la base de datos

            // Cierra la conexión cuando termines
            closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
