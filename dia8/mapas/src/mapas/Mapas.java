/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapas;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Robinson Mosquera
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Integer> map = new HashMap<>();
        
        try{
            map.put("A",1);
            map.put("B",2);
            map.put("C",3);
            
            System.out.println("Valor asociado con A: "+ map.get("A"));
            map.remove(map);
            System.out.println(map);
            
        }catch(NullPointerException e){
            System.out.println("Por favor tener cuidado, accediste a una clave nula");
        }catch(Exception e){
            
        }
    }
    
}
