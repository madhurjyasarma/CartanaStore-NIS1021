package org.example.app;

import java.util.Scanner;

import static org.example.app.choice.AddProducts.listAllProduct;
import static org.example.app.choice.Product.addProduct;
import static org.example.app.choice.SearchProduct.searchProduct;

public class Choices {
    public static Scanner scanner = new Scanner(System.in);
    public static void choices() {
        System.out.println("your choice ::: ");
        char input = scanner.nextLine().charAt(0);

        if (input == '1') {
            addProduct();
        } else if (input == '2') {
            listAllProduct();
        } else if (input == '3') {
            searchProduct();
        } else if (input == 'x' || input == 'X' || input == '4') {
            System.exit(1);
        } else {
            System.out.println("Please enter a valid choice. 1,2,3,X");
        }
    }




}
