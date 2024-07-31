/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;
import java.util.Date;
/**
 *
 * @author Robinson Mosquera
 */
public class PartidoLiga extends Partido {
    private int numeroJornada;

    public PartidoLiga(String equipoLocal, String equipoVisitante, Date fecha, int numeroJornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.numeroJornada = numeroJornada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Partido de Liga:");
        System.out.println("Jornada: " + numeroJornada);
        System.out.println(obtenerResultado());
        System.out.println("Finalizado: " + finalizado);
    }
}