/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Robinson Mosquera
 */
public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int Storage;

    @Override
    public String toString() {
        return "Camputer{" + "CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + ", Storage=" + Storage + '}';
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return Storage;
    }
    
    
}
