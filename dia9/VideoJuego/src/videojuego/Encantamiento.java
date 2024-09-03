/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Encantamiento {
    private String tipoDaño;
    private int cantDaño;
    private String nombre;

    public Encantamiento(String tipoDaño, int cantDaño, String nombre) {
        this.tipoDaño = tipoDaño;
        this.cantDaño = cantDaño;
        this.nombre = nombre;
    }
    
    public String animacionAtaque(){
        return "ataque de forma:";
    }
    public String efectoAtauqe(){
        return "efecto de ataque:";
    }
    public String getTipoDaño() {
        return tipoDaño;
    }

    public int getCantDaño() {
        return cantDaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipoDaño(String tipoDaño) {
        this.tipoDaño = tipoDaño;
    }

    public void setCantDaño(int cantDaño) {
        this.cantDaño = cantDaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
