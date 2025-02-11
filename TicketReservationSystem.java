class Ticket {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int totalTickets = 0;

    // Add a new ticket at the end
    public void bookTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
        totalTickets++;
    }

    // Remove a ticket by Ticket ID
    public void cancelTicket(int ticketId) {
        if (head == null) return;
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else {
                    if (temp == head) head = head.next;
                    if (temp == tail) tail = prev;
                    prev.next = temp.next;
                }
                totalTickets--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display all booked tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Ticket - ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Get total number of booked tickets
    public int getTotalTickets() {
        return totalTickets;
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.bookTicket(1, "Alice", "Inception", "A1", "10:00 AM");
        system.bookTicket(2, "Bob", "Avatar", "B2", "12:00 PM");
        system.bookTicket(3, "Charlie", "Inception", "A3", "10:00 AM");

        system.displayTickets();

        system.searchTicket("Inception");

        system.cancelTicket(2);

        system.displayTickets();

        System.out.println("Total Tickets: " + system.getTotalTickets());
    }
}

