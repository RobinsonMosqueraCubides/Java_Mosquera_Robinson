/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccionquiz;

/**
 *
 * @author Robinson Mosquera
 */
abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    public Personaje(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void recibirDaño(int cantidad) {
        this.salud -= cantidad;
        if (this.salud < 0) {
            this.salud = 0;
        }
    }

    public void atacar(Personaje objetivo) {
        objetivo.recibirDaño(this.fuerza);
    }

    public boolean estaVivo() {
        return this.salud > 0;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void mostrarHabilidadesEspeciales();
}
