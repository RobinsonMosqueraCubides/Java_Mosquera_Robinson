/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrencia;

/**
 *
 * @author Robinson Mosquera
 */
public class BookingThread {
    private TicketBookingSystem ticketSystem;
    private int ticketsToBuy;

    public BookingThread(TicketBookingSystem ticketSystem, int ticketsToBuy, String threadName) {
        this.ticketSystem = ticketSystem;
        this.ticketsToBuy = ticketsToBuy;
    }

    public void run() {
        ticketSystem.buyTickets(ticketsToBuy);
    }
}
