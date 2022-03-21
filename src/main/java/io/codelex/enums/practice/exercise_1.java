package io.codelex.enums.practice;

public class exercise_1 {

    private enum CardinalPoints {
        NORTH("up", 0),
        SOUTH("down", 1),
        EAST("right", 2),
        WEST("left", 3);

        private final String direction;
        private final int num;

        CardinalPoints(String direction, int num) {
            this.direction = direction;
            this.num = num;
        }

        public String getDirection() {
            return direction;
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        for (CardinalPoints c : CardinalPoints.values()) {
            System.out.println(c + ":" + c.getDirection() + ":" + c.getNum());
        }
    }
}
