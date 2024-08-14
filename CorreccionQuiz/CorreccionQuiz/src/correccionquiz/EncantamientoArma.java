/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccionquiz;

/**
 *
 * @author Robinson Mosquera
 */
interface Encantamiento {
    void activar();
    void aplicar();
    void desactivar();
}

class EncantamientoFuego implements Encantamiento {
    public void activar() {
        System.out.println("Se genera un aura de luz");
    }

    public void aplicar() {
        System.out.println("Daño de fuego añadido");
    }

    public void desactivar() {
        System.out.println("El aura de luz se desvanece");
    }
}

class EncantamientoVorpal implements Encantamiento {
    public void activar() {
        System.out.println("El arma se ve roja");
    }

    public void aplicar() {
        System.out.println("Incrementa la posibilidad de ataque crítico");
    }

    public void desactivar() {
        System.out.println("El resplandor rojo desaparece");
    }
}

abstract class Arma {
    protected Encantamiento encantamiento;

    public Arma(Encantamiento encantamiento) {
        this.encantamiento = encantamiento;
    }

    abstract void blandir();
    abstract void atacar();
    abstract void soltar();
}

class Espada extends Arma {
    public Espada(Encantamiento encantamiento) {
        super(encantamiento);
    }

    public void blandir() {
        encantamiento.activar();
    }

    public void atacar() {
        encantamiento.aplicar();
    }

    public void soltar() {
        encantamiento.desactivar();
    }
}

