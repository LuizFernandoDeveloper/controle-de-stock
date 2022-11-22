import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantity in stack: ");
        product.AddProducts(sc.nextInt());
        System.out.println();
        System.out.println("Product data: "+product);
        System.out.print("Do you want to do any other operations, like adding or removing a product? if so what operation");
        String option = "";
        while(option != "exit"){
            option = sc.nextLine();
            switch (option) {
                case "remove":
                    System.out.print("Enter the number of products to be remove in stock: ");
                    product.RemoveProducts(sc.nextInt());
                    System.out.println();
                    System.out.println("Updated data: "+product);
                    option = "exit";
                    break;
                case "add":
                    System.out.print("Enter the number of products to be added in stock: ");
                    product.AddProducts(sc.nextInt());
                    System.out.println();
                    System.out.println("Updated data: "+product);
                    option = "exit";
                    break;
            }
        }
        System.out.println("Leaving the program!");
        sc.close();
    }
}
