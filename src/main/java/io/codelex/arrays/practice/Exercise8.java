package io.codelex.arrays.practice;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder usedLetters = new StringBuilder();

        String[] words = {
                "elephant", "garbage", "package", "exercise", "resources", "homework",
                "computer", "sausage", "hangman"
        };

        boolean playing = true;

        while (playing) {
            //Random vārds no vārdu masīva + pārvaido par char masīvu un izveido ekvivalenta garuma tukšo char masīvu
            String wordToGuess = getRandomName(words).toLowerCase(Locale.ROOT);
            char[] wordToGuessLetters = wordToGuess.toCharArray();
            char[] playerGuess = new char[wordToGuessLetters.length];

            for (int i = 0; i < playerGuess.length; i++) {
                playerGuess[i] = '_';
            }

            boolean wordIsGuessed = false;
            int triesLimit = 12;

            //While cikls tukšā char masīva piepildīšanai
            while (!wordIsGuessed && triesLimit > 0) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("You have " + triesLimit + " amount of guesses left!");
                //System.out.println(wordToGuess);
                System.out.println("Previous guesses: " + usedLetters);
                System.out.print("Word: ");
                System.out.println(playerGuess);
                System.out.println("Enter your guess:");
                char input = scanner.nextLine().charAt(0);
                triesLimit--;
                usedLetters.append(input);

                //Pārbauda vai sakrīt ar minamo vārdu un ievieto tukšajā char masīvā
                for (int i = 0; i < wordToGuessLetters.length; i++) {
                    if (wordToGuessLetters[i] == input) {
                        playerGuess[i] = input;
                    }
                }

                //Pārbauda vai visi ir atminēti un pie true beidz ciklu
                if (isTheWordGuessed(playerGuess)) {
                    wordIsGuessed = true;
                    System.out.println("YOU GOT IT!");
                }
            }

            if(!wordIsGuessed){
                System.out.println("You ran out of guesses.");
                System.out.println("Word that you guessed was - " + wordToGuess);
            }

            System.out.println("Play 'again' or 'quit'? (yes/no)");
            usedLetters.setLength(0);
            String choice = scanner.nextLine();
            if (!choice.equals("yes")) {
                playing = false;
            }

            System.out.println("Game Over!");

        }

    }

    //Metode, kas izvēlās random vārdu no vārdu masīva
    public static String getRandomName(String[] arr) {
        Random random = new Random();
        int randomId = random.nextInt(arr.length);
        String randomWord = arr[randomId];
        return randomWord;
    }

    //Metode lai izvadītu char masīvu
    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Metode, kas apstiprina atminētu vārdu
    public static boolean isTheWordGuessed(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '_') {
                return false;
            }
        }
        return true;
    }
}
