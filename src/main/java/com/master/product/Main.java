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

            Scanner s = new Scanner(System.in);

            String op = s.next();
            switch (op) {
                case "1":
                    products.add(register());
                    break;
                case "2":
                    products.forEach(e -> System.out.println(e.getName()));
                    break;
                case "3":
                	products.forEach(e -> System.out.println("-Name: " + e.getName() + "-Price: " + e.getPrice()
                	 + "-Quantity: " + e.getQuantity() + "-Description: " + e.getDescription()
                            + "-Category: " + e.getCategory()));
                    break;
//                case "4":
//                    String nameSearch;
//                    nameSearch = s.next();
//                    System.out.println(register().getName());
//                    System.exit(0);
//                    break;
                case "0":
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
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.next();
        System.out.print("Price: ");
        Double price = s.nextDouble();
        System.out.print("Description: ");
        String description = s.next();
        System.out.print("Quantity: ");
        Integer quantity = s.nextInt();
        System.out.print("Category: ");
        String category = s.next();

        Product product = new Product(name, price, description, quantity, category);
        
        return product;
      
    }

}
