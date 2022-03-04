package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char player1 = 'X';
        char player2 = 'O';

        //Izveidoju laukumu
        char[][] ticTacToe = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = '-';
            }
        }
        boolean gameEnd = false;
        char currentPlayer = player1;


        //Izvada laukumu
        displayBoard(ticTacToe);

        while (!gameEnd) {

            //Ciparu ievade un derīguma pārbaude. Kamēr nav veikts derīgs gājiens cikls atkārtojas.
            boolean valid = false;
            while (!valid) {
                //Spēlētājs izvēlas lokāciju.
                if (currentPlayer == player1) {
                    System.out.println(player1 + " choose your location (row, column):");
                } else {
                    System.out.println(player2 + " choose your location (row, column):");
                }

                int row = in.nextInt();
                int column = in.nextInt();

                //Pārbaude vai lokācija ir derīga un laukums nav aizņemts!
                if (row < 0 || column < 0 || row > 2 || column > 2) {
                    System.out.println("This position is outside bounds! Try again.");
                } else if (ticTacToe[row][column] != '-') {
                    System.out.println("Field is already taken! Try again.");
                } else {
                    //Ievieto simbolu attiecīgajā vietā un izejam no cikla!
                    ticTacToe[row][column] = currentPlayer;
                    displayBoard(ticTacToe);
                    valid = true;
                    break;
                }

            }

            //Pārbauda vai ir uzvarētājs
            if (playerHasWon(ticTacToe)) {
                System.out.println("Player " + currentPlayer + " has won!");
                gameEnd = true;
            }

            //Ja nav uzvarētājs, tad nomainam aktīvo spēlētāju
            if (currentPlayer == player1) {
                currentPlayer = player2;

            } else {
                currentPlayer = player1;
            }

            //Spēle beidzās, ja ir neizšķirts!
            if (boardIsFull(ticTacToe)) {
                System.out.println("There is a draw!");
                break;
            }
        }
    }

    //Metode, kas izvada laukumu!
    public static void displayBoard(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) System.out.print(arr[i][j]);
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metode, kas pārbauda visas uzvaras situācijas
    public static boolean playerHasWon(char[][] arr) {
        return (arr[0][1] != '-' && arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) ||
                (arr[1][1] != '-' && arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) ||
                (arr[1][0] != '-' && arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) ||
                (arr[2][1] != '-' && arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) ||
                (arr[1][1] != '-' && arr[2][0] == arr[1][1] && arr[0][0] == arr[0][2]) ||
                (arr[1][2] != '-' && arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2]) ||
                (arr[1][1] != '-' && arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]) ||
                (arr[1][1] != '-' && arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]);

    }

    //Metode, kas pārbauda vai laukums nav pilns un nosaka neizšķirtu
    public static boolean boardIsFull(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 'X' && arr[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }
}