package org.example.app.choice;

import java.util.Scanner;

public class Product {
    public static Scanner NUM_SCANNER = new Scanner(System.in);
    public static Scanner STRING_SCANNER = new Scanner(System.in);
    int itemCode;
    String itemName;
    double buyingPrice;
    double sellingPrice;

    double tax;

    int quantity;
    String cat;

    public Product(int itemCode, String itemName, double buyingPrice,
                   double sellingPrice, double tax, int quantity, String cat) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.tax = tax;
        this.quantity = quantity;
        this.cat = cat;
    }


    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }




    public static Product addProduct() {
        System.out.println("Enter item code :: ");
        int itemCode = NUM_SCANNER.nextInt();
        System.out.println("Enter item name :: ");
        String itemName = STRING_SCANNER.nextLine();
        System.out.println("Enter buying price :: ");
        double buyingPrice = NUM_SCANNER.nextDouble();
        System.out.println("Enter selling price :: ");
        double sellingPrice = NUM_SCANNER.nextDouble();
        System.out.println("Enter Tax percentage :: ");
        double tax = NUM_SCANNER.nextDouble();
        System.out.println("Enter quantity :: ");
        int quantity = NUM_SCANNER.nextInt();
        System.out.println("Enter Item category :: ");
        String category = STRING_SCANNER.nextLine();

        Product product = new Product(itemCode,itemName,buyingPrice,sellingPrice,tax,quantity,category);
        System.out.println("Product added");


        NUM_SCANNER.close();
        STRING_SCANNER.close();
        return product;
    }
}
