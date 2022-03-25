package io.codelex.enums.practice.exercise2;

import java.util.Random;

public enum Move {
    ROCK("t"),
    PAPER("p"),
    SCISSORS("s");

    private String move;

    Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public static Move getMoveEnum(String move) {
        for (Move m : Move.values()) {
            if (m.move.equals(move)) {
                return m;
            }
        }
        return null;
    }

    static String getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber].getMove();
    }
}
