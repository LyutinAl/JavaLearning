public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        //int[] ticket2 = new int[ticket.length];
        int[] ticket2 = ticket.clone();

        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    }
    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.print("\n\n");
    }
}