/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Robinson Mosquera
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        try{
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            set.add("F");
            
            System.out.println("El set contiene A?"+ set.contains("A"));
            
            set.remove("B");
            
            System.out.println(set);
        }catch(NullPointerException e){
            System.out.println("Ingresaste una expresion nula");
        }catch(Exception e){
            System.out.println("Exception general: "+e);
        }
    }
}
