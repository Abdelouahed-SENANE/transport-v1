package ma.youcode.transport.ui.admin;

import java.sql.SQLException;
import java.util.Scanner;

import ma.youcode.transport.ui.Menu;
import ma.youcode.transport.ui.admin.ContractUI;
import ma.youcode.transport.ui.admin.PartnerUI;
import ma.youcode.transport.ui.admin.SpecialOfferUI;
import ma.youcode.transport.ui.admin.TicketUI;

public class CostumerMenu  {

    private static  final Scanner sc = new Scanner(System.in);
    private static int choice;



    public static Menu start(Menu menu) {
        do {
            System.out.println("\n================== Costumer Menu ==================");
            System.out.println("1. Manage Reservations");
            System.out.println("2. Update my profile");
            System.out.println("0. Exit");
            System.out.println("================== Costumer Menu ==================\n");
            System.out.println("Choose an option :");
            choice = sc.nextInt();
            choice = getChoice();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (choice != 0);

        return menu;
    }

    public static int getChoice() {

        while (choice < 0 || choice > 2) {
            System.out.println("Enter Number Between 0 - 2");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.println("Number out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a correct number.");
                sc.next();
            }
        }
        return choice;
    }

}
