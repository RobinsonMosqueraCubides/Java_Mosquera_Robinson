/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccionquiz;

/**
 *
 * @author Robinson Mosquera
 */
interface Herrero {
    Arma crearArma();
}

class HerreroElfico implements Herrero {
    public Arma crearArma() {
        // Crear y retornar un arma élfica
        return null;
        // Crear y retornar un arma élfica
    }
}

class HerreroEnano implements Herrero {
    public Arma crearArma() {
        // Crear y retornar un arma enana
        return null;
        // Crear y retornar un arma enana
    }
}

class Armeria {
    private Herrero herrero;

    public Armeria(Herrero herrero) {
        this.herrero = herrero;
    }

    public Arma solicitarArma() {
        return herrero.crearArma();
    }
}

