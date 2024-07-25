/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Robinson Mosquera
 */
public class pabellon {
    private String medicoEnfermero[];
    private String oficioVarios[];
    private String pacientes[];
    private int medicoEnfermeroCount;
    private int oficioVariosCount;
    private int pacientesCount;
    private String nombreSector;
    
    public pabellon(int cantMedicoEnfermero, int cantOficioVarios, int cantPacientes){
        this.medicoEnfermero = new String[cantMedicoEnfermero];
        this.oficioVarios = new String[cantOficioVarios];
        this.pacientes = new String[cantPacientes];
        this.medicoEnfermeroCount = 0;
        this.oficioVariosCount = 0;
        this.pacientesCount = 0;
    }
     // Getter y Setter para nombreSector
    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    // Getter para medicoEnfermero
    public String[] getMedicoEnfermero() {
        return medicoEnfermero;
    }

    // Método para agregar un nuevo elemento a medicoEnfermero
    public void addMedicoEnfermero(String nombre) {
        if (medicoEnfermeroCount < medicoEnfermero.length) {
            medicoEnfermero[medicoEnfermeroCount] = nombre;
            medicoEnfermeroCount++;
        } else {
            System.out.println("El arreglo de Medico/Enfermero está lleno.");
        }
    }

    // Getter para oficioVarios
    public String[] getOficioVarios() {
        return oficioVarios;
    }

    // Método para agregar un nuevo elemento a oficioVarios
    public void addOficioVarios(String nombre) {
        if (oficioVariosCount < oficioVarios.length) {
            oficioVarios[oficioVariosCount] = nombre;
            oficioVariosCount++;
        } else {
            System.out.println("El arreglo de Oficio Varios está lleno.");
        }
    }

    // Getter para pacientes
    public String[] getPacientes() {
        return pacientes;
    }

    // Método para agregar un nuevo elemento a pacientes
    public void addPacientes(String nombre) {
        if (pacientesCount < pacientes.length) {
            pacientes[pacientesCount] = nombre;
            pacientesCount++;
        } else {
            System.out.println("El arreglo de Pacientes está lleno.");
        }
    }
}
