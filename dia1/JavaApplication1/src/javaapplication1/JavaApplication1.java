/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Robinson Mosquera
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    private static List<crearCamper> campers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("Ingrese el numero de su seleccion: \n \t1. Agregar Camper\n \t2. Asignar ruta\n \t3. Salir");
            String select = scanner.nextLine();
            if (Integer.parseInt(select) == 1) {
                crearCamper();
            }else if (Integer.parseInt(select) ==2){
                asignarRuta();
            }else if (Integer.parseInt(select) == 3) {
                break;
            } else {
                System.out.println("Selección no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
    public static void asignarRuta(){
        System.out.println("Ingrese el numero de su seleccion:\n \t1.Ruta NodeJS\n \t2. Ruta Java\n \t3. Ruta NetCore");
        String sele = scanner.nextLine();
        if(Integer.parseInt(sele) == 1){
            
        }
    }
    public static void crearCamper(){
        Scanner scanner = new Scanner(System.in);
        crearCamper camper1 = new crearCamper();
        System.out.println("Ingrese la identificación del camper:");
        camper1.setIdentificacion(scanner.nextLine());
        System.out.println("Ingrese el nombre del camper:");
        camper1.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido del camper:");
        camper1.setApellido(scanner.nextLine());
        System.out.println("Ingrese la dirección del camper:");
        camper1.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el acudiente del camper:");
        camper1.setAcudiente(scanner.nextLine());
        System.out.println("Ingrese el celular del camper:");
        camper1.setCelular(scanner.nextLine());
        camper1.setEstado("inscrito");
        camper1.setRiesgo("sin riesgo");

        // Agregar el objeto a la lista
        campers.add(camper1);
        mostrarCampers(); 
    }
        public static void mostrarCampers() {
        if (campers.isEmpty()) {
            System.out.println("No hay campers registrados.");
        } else {
            for (crearCamper camper : campers) {
                System.out.println("Identificación: " + camper.getIdentificacion());
                System.out.println("Nombre: " + camper.getNombre());
                System.out.println("Apellido: " + camper.getApellido());
                System.out.println("Dirección: " + camper.getDireccion());
                System.out.println("Acudiente: " + camper.getAcudiente());
                System.out.println("Celular: " + camper.getCelular());
                System.out.println("Estado: " + camper.getEstado());
                System.out.println("Riesgo: " + camper.getRiesgo());
                System.out.println();
            }
        }
    }
}
