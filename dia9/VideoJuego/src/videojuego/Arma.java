/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Arma {
    private String tipoAlcance;
    private int cantDaño;
    private Encantamiento encantamiento;
    private String tipoDaño;

    public Arma(String tipoAlcance, int cantDaño, Encantamiento encantamiento, String tipoDaño) {
        this.tipoAlcance = tipoAlcance;
        this.cantDaño = cantDaño;
        this.encantamiento = encantamiento;
        this.tipoDaño = tipoDaño;
    }
    public String animacionAtaque(){
        return "el ataque es:";
    }
    public String efectoAtaque(){
        return "efecto de ataque:";
    }
    public String getTipoAlcance() {
        return tipoAlcance;
    }

    public int getCantDaño() {
        return cantDaño;
    }

    public Encantamiento getEncantamiento() {
        return encantamiento;
    }

    public String getTipoDaño() {
        return tipoDaño;
    }

    public void setTipoAlcance(String tipoAlcance) {
        this.tipoAlcance = tipoAlcance;
    }

    public void setCantDaño(int cantDaño) {
        this.cantDaño = cantDaño;
    }

    public void setEncantamiento(Encantamiento encantamiento) {
        this.encantamiento = encantamiento;
    }

    public void setTipoDaño(String tipoDaño) {
        this.tipoDaño = tipoDaño;
    }
    
    
}
