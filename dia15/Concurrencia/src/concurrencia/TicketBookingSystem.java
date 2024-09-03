/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrencia;

/**
 *
 * @author Robinson Mosquera
 */
public class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    // Método sincronizado para comprar tickets
    public synchronized void buyTickets(int ticketsToBuy) {
        if (ticketsToBuy <= availableTickets) {
            System.out.println(" está comprando " + ticketsToBuy + " ticket(s).");
            availableTickets -= ticketsToBuy;
            System.out.println("Tickets restantes: " + availableTickets);
        } else {
            System.out.println(" intentó comprar " + ticketsToBuy + " ticket(s), pero no hay suficientes tickets disponibles.");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}
