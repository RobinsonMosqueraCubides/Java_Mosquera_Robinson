/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Robinson Mosquera
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de su seleccion: \n \t1. Agregar Camper");
        String select = scanner.nextLine();
        if(Integer.parseInt(select) == 1){
            crearCamper();
        }
    }
    public static void crearCamper(){
        
    }
}
