public class Vendor {
    private static String vendorID;
    private TicketPool ticketPool;
    private int ticketReleaseRate;

    Vendor(String vendorID, TicketPool ticketPool, int ticketReleaseRate){
        this.vendorID = vendorID;
        this.ticketPool = ticketPool;
        this.ticketReleaseRate = ticketReleaseRate;
    } //Constructor to initialize vendor.
    void run(){

    }
}
