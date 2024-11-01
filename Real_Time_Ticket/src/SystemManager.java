import java.util.ArrayList;

public class SystemManager {
    private ArrayList<Vendor> vendors;
    private ArrayList<Customer> customers;
    private TicketPool ticketPool;
    private Configuration configuration;

    void initializeSystem(Configuration config){
        this.configuration = config;
    } //Set up the ticket pool, vendors, and customers.
    void startSystem(){

    } //Start all vendor and customer threads.
    void stopSystem(){

    } //Gracefully stop all threads.
}
