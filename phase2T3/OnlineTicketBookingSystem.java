import java.util.*;

class BookingSystem {

    private ArrayList<String> users = new ArrayList<>();
    private HashMap<Integer, Boolean> seats = new HashMap<>();

    public BookingSystem() {
        for (int i = 1; i <= 5; i++) {
            seats.put(i, false);
        }
    }

    public synchronized void bookTicket(String user, int seatNo) {
        try {
            if (!seats.containsKey(seatNo))
                throw new Exception("Invalid Seat Number.");

            if (seats.get(seatNo)) {
                System.out.println(user + ": Seat " + seatNo + " is already booked.");
            } else {
                seats.put(seatNo, true);
                users.add(user);

                StringBuilder sb = new StringBuilder();
                sb.append("Booking Successful\n");
                sb.append("User: ").append(user).append("\n");
                sb.append("Seat: ").append(seatNo);

                System.out.println(sb);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public <T> void display(T data) {
        System.out.println(data);
    }
}

class UserThread extends Thread {

    BookingSystem booking;
    String name;
    int seat;

    UserThread(BookingSystem booking, String name, int seat) {
        this.booking = booking;
        this.name = name;
        this.seat = seat;
    }

    public void run() {
        booking.bookTicket(name, seat);
    }
}

public class OnlineTicketBookingSystem {

    public static void main(String[] args) {

        BookingSystem booking = new BookingSystem();

        UserThread u1 = new UserThread(booking, "Alice", 1);
        UserThread u2 = new UserThread(booking, "Bob", 2);
        UserThread u3 = new UserThread(booking, "Charlie", 1);

        u1.start();
        u2.start();
        u3.start();
    }
}