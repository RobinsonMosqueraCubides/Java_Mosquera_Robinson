/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Robinson Mosquera
 */
public class Configuracion {
    private static Configuracion instance;
    private String configValue;
    
    private Configuracion(){
        configValue = "Valor por defecto";
    }
    
    public static synchronized Configuracion getInstance(){
        if(instance == null){
            instance = new Configuracion();
        }
        return instance;
    }
    
    public void setConfiguracionValue(String configValue){
        this.configValue = configValue;
    }
    
    public String getConfigValue(){
        return configValue;
    }
}
