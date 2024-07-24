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
/**
 *
 * @author Robinson Mosquera
 */

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    private static List<persona> personas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            System.out.println("Ingrese el numero de su seleccion: \n \t1. Registrar paciente\n \t2. Registrar medicos o enfermeros\n \t3. Registrar oficios varios\n \t4. Salir");
            String select = scanner.nextLine();
                if (Integer.parseInt(select) == 1) {
                    registroPersona("paciente");
                }else if (Integer.parseInt(select) ==2){
                    registroPersona("Medico/enfermero");
                }else if(Integer.parseInt(select) ==3){
                    registroPersona("oficio varios");
                }else if (Integer.parseInt(select) == 4) {
                    break;
                } else {
                    System.out.println("Selección no válida. Intente de nuevo.");
                }
        }
    }
    public static void registroPersona(String tipo){
        persona persona1 = new persona();
        persona1.setTipo(tipo);
        System.out.println("Ingrese el nombre:");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido 1");
        persona1.setApellido1(scanner.nextLine());
        System.out.println("Ingrese el apellido 2 o null");
        persona1.setApellido2(scanner.nextLine());
        System.out.println("Ingrese la direccion");
        persona1.setDireccion(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD)");
        persona1.setFechaNacimiento(scanner.nextLine());
        System.out.println("la fecha de ingreso (YYYY-MM-DD)");
        persona1.setFechaIngreso(scanner.nextLine());
        persona1.setEdad(calculoEdad(persona1.getFechaNacimiento(),persona1.getFechaIngreso()));
        
        personas.add(persona1);
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
}
