package com.master.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to the manager system!!!\n     ----");
		while (true) {
			System.out.println("1 - Register your products\n2 - List products name\n3 - Detailed List\n0 - Exit");

			Scanner sc = new Scanner(System.in);

			String op = sc.next();
			switch (op) {
			case "1":
				products.add(register());
				break;
			case "2":
				products.forEach(e -> System.out.println(e.getName()));
				break;
			case "3":
				products.forEach(e -> System.out.println("-Name: " + e.getName() + "-Price: " + e.getPrice()
						+ "-Quantity: " + e.getQuantity() + "-Description: " + e.getDescription()));
				break;
			case "0":
				System.out.println("Thanks for using our services!!!");
				System.exit(0);
				break;
			default:
				System.out.println("This option doesn't exist");
				break;
			}
		}
	}

	public static void dataValidation(Double price) {
		if (!(price instanceof Double)) {
			throw new InvalidNumberException();
		}
	}

	public static Product register() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scan.next();
		System.out.print("Price: ");
		Double price = scan.nextDouble();
		System.out.print("Description: ");
		String description = scan.next();
		System.out.print("Quantity: ");
		Integer quantity = scan.nextInt();

		Product product = new Product(name, price, description, quantity);

		return product;

	}

}
