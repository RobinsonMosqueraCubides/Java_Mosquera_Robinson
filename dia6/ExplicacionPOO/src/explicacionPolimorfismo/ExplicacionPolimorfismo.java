/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicacionPolimorfismo;

/**
 *
 * @author Robinson Mosquera
 */
public class ExplicacionPolimorfismo {
    
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.hacerSonido();
        Perro perro1 = new Perro();
        perro1.hacerSonido();
        Gato gato1 = new Gato();
    }
    
}
