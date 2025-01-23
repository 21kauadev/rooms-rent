package application;

import java.util.Scanner;

import entities.RoomRentalManager;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        RoomRentalManager[] rentedRooms = new RoomRentalManager[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d:%n", (i + 1));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            System.out.println();

            rentedRooms[roomNumber] = new RoomRentalManager(roomNumber, name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rentedRooms.length; i++) {
            if (rentedRooms[i] != null) {
                System.out.printf("%d: %s, %s%n", rentedRooms[i].getRoomNumber(), rentedRooms[i].getRenterName(),
                        rentedRooms[i].getRenterEmail());
            }

        }

        sc.close();
    }
}