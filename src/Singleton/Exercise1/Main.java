package Singleton.Exercise1;

public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        int ticket1 = ticketMaker1.getNextTicketNumber();
        int ticket2 = ticketMaker2.getNextTicketNumber();

        if (ticket1 == ticket2) {
            System.out.println("ticket1とticket2は同じ番号です。");
        } else {
            System.out.println("ticket1とticket2は違う番号です。");
        }
    }
}
