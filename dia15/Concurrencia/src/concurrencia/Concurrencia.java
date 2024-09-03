/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurrencia;

/**
 *
 * @author Robinson Mosquera
 */
public class Concurrencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TicketBookingSystem ticketSystem = new TicketBookingSystem(10);

        
        BookingThread buyer1 = new BookingThread(ticketSystem, 3, "Cliente 1");
        BookingThread buyer2 = new BookingThread(ticketSystem, 4, "Cliente 2");
        BookingThread buyer3 = new BookingThread(ticketSystem, 5, "Cliente 3");

        
        buyer1.run();
        buyer2.run();
        buyer3.run();
    }
    
}
