import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.ReservationException;

public class App {
    public static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Romm number: ");
            int number = sc.nextInt();
            
            Reservation reservation = new Reservation(number);
            updateDateReservation(reservation, sc);

            System.out.println("\nEnter date to update the reservation: ");
            updateDateReservation(reservation, sc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static void updateDateReservation(Reservation reservation, Scanner sc) {
        try {
            System.out.print("Date to check-in: (dd/mm/yyyy) ");
            LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Date to check-out: (dd/mm/yyyy) ");
            LocalDate checkOut = LocalDate.parse(sc.next(), fmt);
            reservation.updateDates(checkIn, checkOut);

            System.err.println(reservation);
        } catch (ReservationException e) {
            System.out.println(e.getMessage());
        }
    }
}
