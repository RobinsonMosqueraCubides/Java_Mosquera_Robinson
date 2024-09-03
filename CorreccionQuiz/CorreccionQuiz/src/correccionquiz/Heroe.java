/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccionquiz;

/**
 *
 * @author Robinson Mosquera
 */
public class Heroe extends Personaje{
    private static Heroe instancia;


    private Heroe(String nombre, int salud, int fuerza){
        super(nombre,salud,fuerza);
    }
    
    public static Heroe getInstancia(String nombre, int salud, int fuerza) {
        if (instancia == null) {
            instancia = new Heroe(nombre, salud, fuerza);
        }
        return instancia;
    }

    @Override
    public void mostrarHabilidadesEspeciales() {
        System.out.println("habilidad Especial");
    }
    
}
