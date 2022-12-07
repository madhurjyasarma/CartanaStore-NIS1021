package org.example.app;

import java.util.Scanner;

import static org.example.app.Choices.choices;

public class Admin {
    public static Scanner scanner = new Scanner(System.in);
    public static String ADMIN = "admin";
    public static void setAdmin() {
        System.out.print("Enter Admin username to proceed ::: ");
        String admin = scanner.nextLine();
        if (admin.equals(ADMIN)) {
            System.out.println("Admin approved");

            choices();
        }
    }




}
