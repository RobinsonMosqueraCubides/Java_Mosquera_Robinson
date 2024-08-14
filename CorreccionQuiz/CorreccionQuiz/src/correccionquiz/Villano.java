/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccionquiz;

/**
 *
 * @author Robinson Mosquera
 */
class Villano extends Personaje {
    private static final int MAX_INSTANCIAS = 5;
    private static int contadorInstancias = 0;

    public Villano(String nombre, int salud, int fuerza) throws Exception {
        super(nombre, salud, fuerza);
        if (contadorInstancias >= MAX_INSTANCIAS) {
            throw new Exception("No se pueden crear más de " + MAX_INSTANCIAS + " villanos");
        }
        contadorInstancias++;
        this.fuerza = fuerza;
    }

    @Override
    public void mostrarHabilidadesEspeciales() {
        System.out.println("Habilidad malvada");
    }
}
