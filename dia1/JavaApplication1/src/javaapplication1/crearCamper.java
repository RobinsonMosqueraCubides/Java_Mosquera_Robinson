/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Robinson Mosquera
 */
public class crearCamper {
    private String identificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private String acudiente;
    private String celular;
    private String estado;
    private String riesgo;
    
    // constructor 
    public crearCamper(){}
    
    // Sets
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setAcudiente(String acudiente){
        this.acudiente = acudiente;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setRiesgo(String riesgo){
        this.riesgo = riesgo;
    }
    
    // Gets
    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstado() {
        return estado;
    }

    public String getRiesgo() {
        return riesgo;
    }
}
