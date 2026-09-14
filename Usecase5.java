public class Usecase5 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.setName("Counter 1");
        t2.setName("Counter 2");
        t1.start();
        t2.start();
    }
    
}
class TicketCounter implements Runnable {
    int availabletickets = 3;
    @Override
    public void run(){
        while(availabletickets > 0)
            bookTickets();
    }
    public synchronized void bookTickets(){
        if(availabletickets > 0){
            availabletickets = availabletickets - 1;
            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            System.out.println("left tickets are " + availabletickets);
        }
        else{
            System.out.println("Tickets are sold out");
        }
    }
}
