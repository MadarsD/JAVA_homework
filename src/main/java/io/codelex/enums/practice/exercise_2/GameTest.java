package io.codelex.enums.practice.exercise_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlays = 1;
        int wins = 0;
        int loses = 0;

        System.out.println("Let us begin...");

        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String move = scanner.nextLine();

            if (move.equals("q")) {
                System.out.println("Number of trials: " + numberOfPlays);
                System.out.println("I won " + wins + "(" + ((float) (wins * 100) / numberOfPlays)
                        + "%). Computer won " + loses + "(" + ((float) (loses * 100) / numberOfPlays) + "%)");
                System.out.println("Bye!");
                break;
            }

            if (Arrays.stream(Move.values()).noneMatch(x -> x.getMove().equals(move))) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            String computerMove = getComputerMove();

            if (move.equals(computerMove)) {
                System.out.println("My turn:" + Move.getMoveEnum(move));
                System.out.println("It's a tie!");
                numberOfPlays++;
            } else if (doesPlayerWin(move, computerMove)) {
                System.out.println("My turn:" + Move.getMoveEnum(move));
                System.out.println("You won!");
                wins++;
                numberOfPlays++;
            } else {
                System.out.println("My turn:" + Move.getMoveEnum(move));
                System.out.println("You lost!");
                loses++;
                numberOfPlays++;
            }
        }
    }

    private static String getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber].getMove();
    }

    private static boolean doesPlayerWin(String playerMove, String computerMove) {
        return playerMove.equals(Move.ROCK.getMove()) && computerMove.equals(Move.SCISSORS.getMove())
                || (playerMove.equals(Move.SCISSORS.getMove()) && computerMove.equals(Move.PAPER.getMove()))
                || (playerMove.equals(Move.PAPER.getMove()) && computerMove.equals(Move.ROCK.getMove()));
    }
}
