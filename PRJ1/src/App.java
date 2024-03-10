import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Worker worker = new Worker();

        System.out.print("Enter departament's name: ");
        worker.setDepartament(new Departament(sc.nextLine()));

        System.out.println("\nEnter worker data");
        System.out.print("Name: ");
        worker.setName(sc.nextLine());
        System.out.print("Level: ");
        worker.setWorkerLevel(WorkerLevel.valueOf(sc.next()));
        System.out.print("Base salary: $ ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.print("\nHow many contracts to this worker? ");
        short qtContracts = sc.nextShort();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (short i = 0; i < qtContracts; i++) {
            LocalDate date;
            Double valuePerHour;
            int hours;

            System.out.println("\nEnter contract #" + (i + 1));
            System.out.print("Date: (DD/MM/YYYY) ");
            date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();
            System.out.print("Duration: (hours) ");
            hours = sc.nextInt();

            worker.addContract(new HourContract(date, valuePerHour, hours));
        }

        System.out.print("\nEnter month and year to calculate income: (MM/YYYY) ");
        String date = sc.next();
        sc.close();

        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3, 7));

        System.out.println("Worker: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income: (" + date + ") " + worker.income(year, month));
    }
}
