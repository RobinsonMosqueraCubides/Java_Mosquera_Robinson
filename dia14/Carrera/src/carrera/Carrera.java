/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera;

/**
 *
 * @author Robinson Mosquera
 */
class Carrera {
    private static final Object testigo = new Object(); // Objeto compartido que representa el testigo
    private static int atletaActual = 0; // Controla qué atleta tiene el testigo
    
    public static void main(String[] args) {
        Atleta[] atletas = new Atleta[4];

        // Inicializamos a los atletas
        for (int i = 0; i < atletas.length; i++) {
            atletas[i] = new Atleta(i);
        }

        // Iniciamos a los atletas
        for (int i = 0; i < atletas.length; i++) {
            new Thread(atletas[i]).start();
        }
    }

    static class Atleta implements Runnable {
        private int id;

        public Atleta(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            synchronized (testigo) {
                try {
                    // Los atletas esperan su turno
                    while (id != atletaActual) {
                        testigo.wait(); // Espera a que sea su turno
                    }

                    // Comienza a correr
                    System.out.println("Atleta " + id + " ha comenzado a correr.");
                    long startTime = System.currentTimeMillis();
                    
                    // Simula el tiempo de la carrera (entre 9 y 11 segundos)
                    Thread.sleep((int) (Math.random() * 2000) + 9000);
                    
                    long endTime = System.currentTimeMillis();
                    System.out.println("Atleta " + id + " ha terminado de correr en " + (endTime - startTime) / 1000 + " segundos.");

                    // Pasar el testigo al siguiente atleta
                    atletaActual++;
                    testigo.notifyAll(); // Notifica al siguiente atleta
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

