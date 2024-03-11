package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        setRoomNumber(roomNumber);
        updateDates(checkIn, checkOut);
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        } else if (checkIn.isBefore(LocalDate.now())) {
            System.out.println("Error in reservation: Check-in date must be future dates!");
        } else {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(roomNumber);
        sb.append(", check-in: ").append(checkIn.format(fmt));
        sb.append(", check-out: ").append(checkOut.format(fmt));
        sb.append(", ");
        sb.append(duration()).append(" nights");
        return sb.toString();
    }
}
