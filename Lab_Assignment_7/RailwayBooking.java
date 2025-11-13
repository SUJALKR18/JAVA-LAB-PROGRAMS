import java.util.*; 
class Ticket { 
    static int counter = 1000;  
    int ticketId; 
    String passengerName; 
    int age; 
    String source; 
    String destination; 
    Ticket(String passengerName, int age, String source, String destination) { 
        this.ticketId = counter++; 
        this.passengerName = passengerName; 
        this.age = age; 
        this.source = source; 
        this.destination = destination; 
    } 
    public String toString() { 
        return "Ticket ID: " + ticketId + ", Passenger: " + passengerName + 
               ", Age: " + age + ", From: " + source + ", To: " + destination; 
    } 
} 
public class RailwayBooking { 
    public static void main(String[] args) { 
        ArrayList<Ticket> tickets = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in); 
 
        while (true) { 
            System.out.println("\n1. Book Ticket\n2. View Tickets\n3. Cancel Ticket\n4. Exit"); 
            System.out.print("Enter choice: "); 
            int choice = sc.nextInt(); 
            sc.nextLine(); 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter Name: "); 
                    String name = sc.nextLine(); 
                    System.out.print("Enter Age: "); 
                    int age = sc.nextInt(); 
                    sc.nextLine(); 
                    System.out.print("Enter Source: "); 
                    String src = sc.nextLine(); 
                    System.out.print("Enter Destination: "); 
                    String dest = sc.nextLine(); 
 
                    Ticket newTicket = new Ticket(name, age, src, dest); 
                    tickets.add(newTicket); 
                    System.out.println("Ticket Booked Successfully! Your Ticket ID (PNR): " + newTicket.ticketId); 
                    break; 
                case 2: 
                    if (tickets.isEmpty()) { 
                        System.out.println("No tickets booked yet."); 
                    } else { 
                        System.out.println("\nBooked Tickets:"); 
                        for (Ticket t : tickets) 
                            System.out.println(t); 
                    } 
                    break; 
 
                case 3: 
                    System.out.print("Enter Ticket ID (PNR) to cancel: "); 
                    int cancelId = sc.nextInt(); 
                    boolean removed = tickets.removeIf(t -> t.ticketId == cancelId); 
                    if (removed) 
                        System.out.println("Ticket with ID " + cancelId + " cancelled successfully."); 
                    else 
                        System.out.println("Ticket ID not found."); 
                    break; 
 
                case 4: 
                    System.out.println("Exiting..."); 
                    sc.close(); 
                    return; 
 
                default: 
                    System.out.println("Invalid choice!"); 
            } 
        } 
    } 
}