class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        // Hotel Booking Objects
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}
