
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class RailwaySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("---------Welcome to Railway Reservation System---------");

        while (true) {
            System.out.println();
            System.out.println("1 -  View Available Train Details:");
            System.out.println("2 -  Book Ticket:");
            System.out.println("3 -  View Booking Status:");
            System.out.println("4 -  Cancel Ticket:");
            System.out.println("5 -  Exit:");
            System.out.println();

            RailwayReservation t1 = new RailwayReservation();

            System.out.print("Please Enter Your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    t1.viewAvailableTrains();
                    break;
                case 2:
                    t1.bookTicket();
                    break;
                case 3:
                    t1.viewBookedTicket();
                    break;

                default:
                    System.out.println("Invalid Input ,Please Enter (1-5)!");
            }


        }

    }

}

