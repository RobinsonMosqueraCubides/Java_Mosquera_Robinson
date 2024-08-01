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
public abstract class Partido {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int cestasLocal;
    protected int cestasVisitante;
    protected boolean finalizado;
    protected Date fecha;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    
    public Partido(String equipoLocal, String equipoVisitante, Date fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.finalizado = false;
        this.fecha = fecha;
    }

    public void registrarPuntosLocal(int puntos) {
        if (!finalizado) {
            this.cestasLocal += puntos;
        }
    }

    public void registrarPuntosVisitante(int puntos) {
        if (!finalizado) {
            this.cestasVisitante += puntos;
        }
    }

    public String obtenerResultado() {
        return equipoLocal + " " + cestasLocal + " - " + cestasVisitante + " " + equipoVisitante;
    }

    public String obtenerGanador() {
        if (cestasLocal > cestasVisitante) {
            return equipoLocal;
        } else if (cestasVisitante > cestasLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }

    public void finalizarPartido() {
        this.finalizado = true;
    }

    public abstract void mostrarInformacion();
}

