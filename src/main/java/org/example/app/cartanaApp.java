package org.example.app;

import java.util.Scanner;

import static org.example.app.Menu.menu;
import static org.example.app.Admin.setAdmin;

// The App Class
public class cartanaApp {
    //Global Scanner object to take input
    public static Scanner scanner = new Scanner(System.in);
    // the app
    public static void cartanaApp() {

        // taking input for menu driven program using scanner obj
        char choice = scanner.next().charAt(0);
        // if user type X or x, Program should exit with a thanks note
        if (choice == 'X' || choice == 'x') {
            System.out.println("Thanks for using our services.");
            System.exit(1);
        }
        //
        else {
            menu();
            setAdmin();
        }

    }


}
