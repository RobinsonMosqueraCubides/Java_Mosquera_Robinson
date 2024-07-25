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
    private static List<pabellon> pabellones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
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
                    break;
                } else {
                    System.out.println("Selección no válida. Intente de nuevo.");
                }
        }
    }
    
        public static void registroPabellon(){
        System.out.println("Ingrese la cantidad de Medicos/enfermeros");
        int cantMedicos = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad de oficios Varios");
        int cantOficios = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad de pacientes");
        int cantPacientes = Integer.parseInt(scanner.nextLine());
        pabellon pabellon1 = new pabellon(cantMedicos, cantOficios, cantPacientes);
        System.out.println("Ingrese el nombre del pabellon");
        pabellon1.setNombreSector(scanner.nextLine());
        pabellones.add(pabellon1);
        mensajeAgregado();
    }
    
    public static void registroPersona(String tipo){
        persona persona1 = new persona();
        persona1.setTipo(tipo);
        System.out.println("Ingrese le numero de identificacion:");
        persona1.setIdentificacion(scanner.nextLine());        
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
        if(tipo == "Medico/enfermero" || tipo == "oficio varios"){
            System.out.println("Ingrese el salario:");
            persona1.setSalario(Double.parseDouble(scanner.nextLine()));
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
        if(pabellones.size()>0){
            System.out.println("Ingrese el nombre del pabellon");
            int pb = indexPabellon(scanner.nextLine());
            if(pb >= 0){
                System.out.println(pabellones.get(pb).getNombreSector());
            }else{
                System.out.println("Pabellon no existe");
                asignarPabellon();
            }
        }else{
            System.out.println("No hay Pabellones por asignar");
        }
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
    
