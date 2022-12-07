package org.example.app.choice;

import java.util.Scanner;

public class AddProducts {
    public static Scanner NUM_SCANNER = new Scanner(System.in);

    public static void listAllProduct() {
        System.out.println("Enter how many products you want to insert :: ");
        int total = NUM_SCANNER.nextInt();

        Product[] products = new Product[total];

        for (int i=0; i< products.length; i++) {
            products[i].addProduct();
            System.out.println("product added!");
        }

        for (int i=0; i<total; i++) {
            System.out.println(products[i].getItemCode());
            System.out.println(products[i].getItemName());
            System.out.println(products[i].getBuyingPrice());
            System.out.println(products[i].getSellingPrice());
            System.out.println(products[i].getTax());
            System.out.println(products[i].getQuantity());
            System.out.println(products[i].cat);
        }
    }
}
