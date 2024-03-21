import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        // C:\Users\miguel\Documents\GitHub\java-training-projects\PRJ9\source.csv
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("File path: ");
        String sourceStr = sc.nextLine();

        File sourceFile = new File(sourceStr);
        File targetFile = new File(sourceFile.getParent() + "\\out\\summary.csv");

        new File(targetFile.getParent()).mkdir();

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line = br.readLine();
            while (line != null) {
                products.add(genProduct(line));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for(Product p : products){
                    bw.write(p.getName() + "," + String.format("%.2f", p.getTotal()));
                    bw.newLine();
                }

                System.out.println(targetFile + " CREATED!");
            }
            catch(IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }

    private static Product genProduct(String line) {
        String[] content = line.split(",");
        double vl = Double.parseDouble(content[1]);
        int qt = Integer.parseInt(content[2]);

        return new Product(content[0], vl, qt);
    }
}
