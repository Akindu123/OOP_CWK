public class Ticket {
    private static String ticketID;
    private static String eventName;
    private static int ticketPrice;

    Ticket(String ticketID, String eventName, double price){
        this.ticketID = ticketID;
        this.eventName = eventName;
        this.ticketPrice = (int) price;
    } //Constructor to initialize ticket details.


}
