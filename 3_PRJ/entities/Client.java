package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String mail;
    private LocalDate birthDate;

    public Client(String name, String mail, LocalDate birthDate) {
        setBirthDate(birthDate);
        setMail(mail);
        setName(name);
    }

    public Client() {

    }

    public String toString() {
        String fmt = "%s (%s) - %s";
        return String.format(fmt, getName(), birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), getMail());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail.toUpperCase();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
