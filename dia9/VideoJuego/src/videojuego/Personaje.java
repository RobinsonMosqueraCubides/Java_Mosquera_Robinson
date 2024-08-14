/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author Robinson Mosquera
 */
public class Personaje {
    private String sexo;
    private String nombre;
    private String raza;
    private String tipoArma;
    private int cantVida;
    private int cantDef;
    private String tipoArmadura;
    private int cantDaño;

    public Personaje() {

    }
    
    public String esquivar(){
        return "Se a esquivado";
    }
    public String atacar(){
        return "Ataque con:"+this.tipoArma;
    }
    public String dañoRecibido(int daño){
        int dañoTotal = daño-this.cantDef;
        this.cantVida = this.cantVida-dañoTotal;
        return "daño recibido fue: "+dañoTotal;
    }
    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public int getCantVida() {
        return cantVida;
    }

    public int getCantDef() {
        return cantDef;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public int getCantDaño() {
        return cantDaño;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public void setCantVida(int cantVida) {
        this.cantVida = cantVida;
    }

    public void setCantDef(int cantDef) {
        this.cantDef = cantDef;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }

    public void setCantDaño(int cantDaño) {
        this.cantDaño = cantDaño;
    }
}
