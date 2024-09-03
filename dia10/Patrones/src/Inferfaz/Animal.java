/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inferfaz;

/**
 *
 * @author Robinson Mosquera
 */
public interface Animal {
    //metodo abstracto
    public void sound();
    
    //Metodo por defecto
    default void sleep(){
        System.out.println("El animal esta mimiendo");
    }
}
