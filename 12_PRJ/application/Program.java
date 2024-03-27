package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> codes = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		catchCodes(sc, codes, sc.nextInt());
		
		System.out.print("How many students for course B? ");
		catchCodes(sc, codes, sc.nextInt());
		
		System.out.print("How many students for course C? ");
		catchCodes(sc, codes, sc.nextInt());
		
		sc.close();
		
		System.out.println("Total students: " + codes.size());
	}

	private static void catchCodes(Scanner sc, Set<Integer> codes, int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print("Code #" + i+ ": ");
			codes.add(sc.nextInt());
		}
		System.out.println();
		
	}
}
