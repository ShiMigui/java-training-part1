package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.ReservationException;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber) {
        setRoomNumber(roomNumber);
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws ReservationException {
        setRoomNumber(roomNumber);
        updateDates(checkIn, checkOut);
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws ReservationException {
        if (!checkOut.isAfter(checkIn)) {
            throw new ReservationException("Error in reservation: Check-out date must be after check-in date!");
        }
        if (checkIn.isBefore(LocalDate.now())) {
            throw new ReservationException("Error in reservation: Check-in date must be future dates!");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
