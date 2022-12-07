package org.example;

import static org.example.app.cartanaApp.cartanaApp;

// Main Class
public class Main {
    // Driver method
    public static void main(String[] args) {
        // Handling Exception
        try {
            // Welcome prompt
            System.out.println("%%%%%%%%%%%%%%%%%% Welcome to Cartana App %%%%%%%%%%%%%%%%%%");
            System.out.println("Press X to exit the Program");
            System.out.println("Press Y to enter the program");
            System.out.println("Enter here ::: ");
            // Menu Driven using do-while
            do {
                // The app
                cartanaApp();
            }while (true);

        }
        catch (Exception e) {
        }
    }

}