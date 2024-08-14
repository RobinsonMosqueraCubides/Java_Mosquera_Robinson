/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Villano extends Personaje{
    private int cantVillano;

    public Villano(String sexo, String nombre, String raza, String tipoArma) {
        this.setNombre(nombre);
        this.setSexo(sexo);
        this.setTipoArma(tipoArma);
        this.setRaza(raza);
        this.cantVillano++;
        //Aqui tambien se puede poner los parametros base como la vida, armadura etc
    }

    public int getCantVillano() {
        return cantVillano;
    }
    
}
