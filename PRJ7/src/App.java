import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Romm number: ");
        int number = sc.nextInt();
        System.out.print("Date to check-in: (dd/mm/yyyy) ");
        LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
        System.out.print("Date to check-out: (dd/mm/yyyy) ");
        LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.err.println(reservation);
            
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Date to check-in: (dd/mm/yyyy) ");
            checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Date to check-out: (dd/mm/yyyy) ");
            checkOut = LocalDate.parse(sc.next(), fmt);
            
            System.err.println(reservation);
        }

        sc.close();
    }
}
