/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author Robinson Mosquera
 */
public class GamingComputer extends ComputerBuilder{

    @Override
    public void biuldCPU() {
        computer.setCPU("intel i9");
    }

    @Override
    public void biuldGPU() {
        computer.setGPU("RTX 4090");
    }

    @Override
    public void biuldRAM() {
        computer.setRAM(64);
    }

    @Override
    public void biuldStorage() {
        computer.setStorage(1024);
    }
    
}
