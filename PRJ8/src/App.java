import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            Integer number;
            String holder;
            Double balance, withdrawLimit, amount;

            //#region Criando conta
            System.out.println("Enter the account data");
            System.out.print("Number: ");
            number = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            holder = sc.nextLine();
            System.out.print("Initial balance: $");
            balance = sc.nextDouble();
            System.out.print("Withdraw limit: $");
            withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, balance, withdrawLimit);
            //#endregion

            //#region Withdraw
            System.out.println();
            System.out.print("Enter amount for withdraw: $");
            amount = sc.nextDouble();
            account.withdraw(amount);
            //#endregion
            
            System.out.println(account);
        } 
        catch (AccountException e) {
            System.out.println(e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
