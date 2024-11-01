public class Customer {
    private String customerID;
    private TicketPool ticketPool;
    private int retrievalRate;

    Customer(String customerID, TicketPool ticketPool, int retrievalRate){
        this.customerID = customerID;
        this.ticketPool = ticketPool;
        this.retrievalRate = retrievalRate;
    } //Constructor to initialize customer.
    void run(){

    }
}
