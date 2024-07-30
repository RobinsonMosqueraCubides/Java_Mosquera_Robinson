/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;
/**
 *
 * @author Robinson Mosquera
 */

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    private static List<persona> personas = new ArrayList<>();
    private static List<pabellon> pabellones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Properties props = new Properties();
    private static String url = props.getProperty("url");
    private static String username = props.getProperty("username");
    private static String password = props.getProperty("password");
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            System.out.println("Ingrese el numero de su seleccion: \n \t1. Registrar paciente\n \t2. Registrar medicos o enfermeros\n \t3. Registrar oficios varios\n \t4. Registar nuevo Pabellon\n \t5. Asignar Pabellon\n \t6. Salir");
            String select = scanner.nextLine();
                if (Integer.parseInt(select) == 1) {
                    registroPersona("paciente");
                }else if (Integer.parseInt(select) ==2){
                    registroPersona("Medico/enfermero");
                }else if(Integer.parseInt(select) ==3){
                    registroPersona("oficio varios");
                }else if (Integer.parseInt(select) == 4) {
                    registroPabellon();
                }else if (Integer.parseInt(select) == 5) {
                    asignarPabellon();
                }else if (Integer.parseInt(select) == 6) {
                    conectarBaseDatos();
                }else if (Integer.parseInt(select) == 7) {
                    break;
                } else {
                    System.out.println("Selección no válida. Intente de nuevo.");
                }
        }
    }
    
    public static void conectarBaseDatos(){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        System.out.println(url);
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            connection = DriverManager.getConnection(url, username, password);

            // Consulta SQL para insertar datos en la tabla persona
            String sql = "INSERT INTO persona (nombre, apellido1, apellido2, fechaNacimiento, direccion, fechaIngreso, identificacion, salario, edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Crear un PreparedStatement
            preparedStatement = connection.prepareStatement(sql);

            // Establecer los valores de los parámetros
            preparedStatement.setString(1, "Robin");              // nombre
            preparedStatement.setString(2, "Mosquera");             // apellido1
            preparedStatement.setString(3, "Cubides");             // apellido2
            preparedStatement.setString(4, "1995-05-15");        // fechaNacimiento
            preparedStatement.setString(5, "Calle Rica 123");   // direccion
            preparedStatement.setString(6, "2024-07-30");        // fechaIngreso
            preparedStatement.setString(7, "123456789");         // identificacion
            preparedStatement.setDouble(8, 45000.50);            // salario
            preparedStatement.setInt(9, 44);                     // edad

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
    
    public static String ingresoString(String mensaje){
        System.out.println(mensaje);
        return scanner.nextLine();
    }
    
    public static int ingresoInt(String mensaje){
        System.out.println(mensaje);
        int flag;
        while(true){
        try{
            flag = Integer.parseInt(scanner.nextLine());
            break;
        }catch(Exception e){
            System.out.println("tipo de dato incorrecto");
        }
        }
        return flag;
    }
    
    public static void registroPabellon(){
        int cantMedicos = ingresoInt("Ingrese la cantidad de Medicos/enfermeros");
        int cantOficios = ingresoInt("Ingrese la cantidad de oficios Varios");
        int cantPacientes = ingresoInt("Ingrese la cantidad de pacientes");
        pabellon pabellon1 = new pabellon(cantMedicos, cantOficios, cantPacientes);
        pabellon1.setNombreSector(ingresoString("Ingrese el nombre del pabellon"));
        pabellones.add(pabellon1);
        mensajeAgregado();
    }
    
    public static void registroPersona(String tipo){
        persona persona1 = new persona();
        persona1.setTipo(tipo);
        persona1.setIdentificacion(ingresoString("Ingrese el numero de identificacion:"));
        persona1.setNombre(ingresoString("Ingrese el nombre:"));
        persona1.setApellido1(ingresoString("Ingrese el apellido 1:"));
        persona1.setApellido2(ingresoString("Ingrese el apellido 2 o null:"));
        persona1.setDireccion(ingresoString("Ingrese la direccion:"));
        persona1.setFechaNacimiento(ingresoString("Ingrese la fecha de nacimiento (YYYY-MM-DD):"));
        persona1.setFechaIngreso(ingresoString("Ingrese la fecha de ingreso (YYYY-MM-DD):"));
        persona1.setEdad(calculoEdad(persona1.getFechaNacimiento(), persona1.getFechaIngreso()));

        if (tipo.equals("Medico/enfermero") || tipo.equals("oficio varios")) {
            persona1.setSalario(Double.parseDouble(ingresoString("Ingrese el salario:")));
        }
        personas.add(persona1);
        mensajeAgregado();
    }
    public static void mensajeAgregado(){
        System.out.println("Agregado correctamente");
        try {
            // Pausar la ejecución por 1000 milisegundos (1 segundo)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido.");
        }
    }
    
    public static int calculoEdad(String fechaNacimiento, String fechaIngreso){
        LocalDate fn = LocalDate.parse(fechaNacimiento);
        LocalDate fi = LocalDate.parse(fechaIngreso);
        if ((fn != null) && (fi != null)) {
            return Period.between(fn, fi).getYears();
        } else {
            return 0;
        }
    }
    
    public static void asignarPabellon(){
        if (!pabellones.isEmpty()) {
            System.out.println("Ingrese el nombre del pabellón:");
            int pb = indexPabellon(scanner.nextLine());
            if (pb >= 0) {
                System.out.println("Ingrese la identificación:");
                int ps = indexPersona(scanner.nextLine());
                if (ps >= 0) {
                    String tipoPersona = personas.get(ps).getTipo().toLowerCase();
                    String identificacion = personas.get(ps).getIdentificacion();
                    switch (tipoPersona) {
                        case "paciente":
                            pabellones.get(pb).addPacientes(identificacion);
                            mensajeAgregado();
                            break;
                        case "oficio varios":
                            pabellones.get(pb).addOficioVarios(identificacion);
                            mensajeAgregado();
                            break;
                        case "medico/enfermero":
                            pabellones.get(pb).addMedicoEnfermero(identificacion);
                            mensajeAgregado();
                            break;
                        default:
                            System.out.println("Tipo no encontrado");
                            break;
                    }
                } else {
                    System.out.println("Persona no encontrada");
                }
            } else {
                System.out.println("Pabellón no existe");
                asignarPabellon();
            }
        } else {
            System.out.println("No hay pabellones por asignar");
        }

    }
   
    public static int indexPersona(String identificacion){
        int index = 0;
        for (persona persona : personas){
            if (persona.getIdentificacion().equalsIgnoreCase(identificacion)){
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int indexPabellon(String nombre){
        int index = 0;
        for (pabellon pabellon : pabellones) {
            if (pabellon.getNombreSector().equalsIgnoreCase(nombre)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    }
    
