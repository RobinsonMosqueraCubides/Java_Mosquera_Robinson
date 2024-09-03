/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Robinson Mosquera
 */
public class SingletonExample {
    //Garantizar que una clase tenga solo una instancia y proporcionar un punto 
    // de acceso global a ella.
    public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstance();
        Configuracion config2 = Configuracion.getInstance();
        
        System.out.println(config1.getConfigValue());
        config1.setConfiguracionValue("new value");
        System.out.println(config2.getConfigValue());
    }
}
