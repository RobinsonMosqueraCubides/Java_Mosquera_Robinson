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
public class PartidoPlayOffs extends Partido {
    private String ronda;

    public PartidoPlayOffs(String equipoLocal, String equipoVisitante, Date fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    @Override
    public void finalizarPartido() {
        if (cestasLocal != cestasVisitante) {
            super.finalizarPartido();
        } else {
            System.out.println("El partido está empatado y no puede finalizarse sin un ganador.");
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Partido de PlayOffs:");
        System.out.println("Ronda: " + ronda);
        System.out.println(obtenerResultado());
        System.out.println("Finalizado: " + finalizado);
    }
}

