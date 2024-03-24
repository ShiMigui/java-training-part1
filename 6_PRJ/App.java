import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;
import util.Formatter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Payer[] payers;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of payers: ");
        payers = new Payer[sc.nextInt()];

        for (int i = 0; i < payers.length; i++) {
            String name;
            Double income;

            System.out.println("\nPayer #" + (i + 1));
            System.out.print("Individual or company? (i/c) ");
            Boolean isCompany = sc.next().toLowerCase().charAt(0) == 'c';
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Income: ");
            income = sc.nextDouble();
            if (isCompany) {
                System.out.print("Number of employees: ");
                payers[i] = new Company(name, income, sc.nextInt());
            } else {
                System.out.print("Medical costs: ");
                payers[i] = new Individual(name, income, sc.nextDouble());
            }
        }
        sc.close();


        Double sum = 0.0;
        for(Payer p : payers){
            System.out.println();
            System.out.println(p);
            sum += p.getTotalTax();
        }

        System.out.println("\nTOTAL TAXES: " + Formatter.currency(sum));
    }
}
