package io.codelex.classesandobjects.practice;

import java.awt.*;

public class swapPoints_exercise9 {
    public static void main(String[] args) {
        Point p1 = new Point(5,2);
        Point p2 = new Point(-3, 6);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");

    }

    public static void swapPoints(Point one, Point two){
        double tempOneX = two.getX();
        double tempOneY = two.getY();
        two.setLocation(one);
        one.setLocation(tempOneX, tempOneY);
    }
}
