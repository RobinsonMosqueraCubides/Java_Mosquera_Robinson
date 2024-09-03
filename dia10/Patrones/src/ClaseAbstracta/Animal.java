/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstracta;

/**
 *
 * @author Robinson Mosquera
 */
public abstract class Animal {
    protected String name;
    
    public Animal(String name){
        this.name=name;
    }
    
    public abstract void sound();
}
