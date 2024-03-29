package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();

		Map<String, Integer> candidates = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				Integer votos = Integer.parseInt(fields[1]);
				Integer memoryVotos = candidates.get(fields[0]);
				
				if (candidates.containsKey(fields[0])) {
					candidates.put(fields[0], votos);
				} else {
					candidates.put(fields[0], memoryVotos + votos);
				}
				
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
		
		for(String c : candidates.keySet()) {
			System.out.println(c + ": " + candidates.get(c));
		}

	}
}
