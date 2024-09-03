/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Espada extends Arma{
    private String nombre;
    private String tipo;
    public Espada(String tipoAlcance, int cantDaño, Encantamiento encantamiento, String tipoDaño) {
        super(tipoAlcance, cantDaño, encantamiento, tipoDaño);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
