package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? $ %.2f%n", Dollar.dollarPrice);
		
		System.out.print("How many Dollars will be bought? $ ");
		double buyDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in R$ %.2f%n", Dollar.buyDollar(buyDollar));
		
		sc.close();
	}

}
