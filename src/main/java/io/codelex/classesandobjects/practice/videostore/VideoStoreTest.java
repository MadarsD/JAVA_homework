package io.codelex.classesandobjects.practice.videostore;


import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore store = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list all available videos");
            System.out.println("Choose 5 to rate a video");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    listVideos(keyboard);
                    break;
                case 5:
                    rateVideo(keyboard);
                    break;
                default:
                    break;
            }

        }

    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            scanner.nextLine();
            //todo - add video
            store.addVideo(movieName);
            store.rateVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to rent");
        String movieName = scanner.next();
        scanner.nextLine();
        //todo - rent video
        store.checkOut(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to return");
        String movieName = scanner.next();
        scanner.nextLine();
        //todo - return video
        store.returnVideo(movieName);
    }

    private static void rateVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to rate");
        String movieName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter the rating");
        int rating = scanner.nextInt();
        scanner.nextLine();
        store.rateVideo(movieName,rating);
    }

    private static void listVideos(Scanner scanner){
        store.listInventory();
    }
}
