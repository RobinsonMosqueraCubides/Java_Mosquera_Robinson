/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Heroe extends Personaje{
    private int cantHeroe;
    
    public Heroe(String sexo, String nombre, String raza, String tipoArma) {
        this.setNombre(nombre);
        this.setSexo(sexo);
        this.setTipoArma(tipoArma);
        this.setRaza(raza);
        this.cantHeroe++;
        //Aqui tambien se puede poner los parametros base como la vida, armadura etc
    }

    public int getCantHeroe() {
        return cantHeroe;
    }
    
}
