package io.codelex.polymorphism.practice.exercise2;

import java.util.LinkedList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework fireworkOne = new Firework();
        Parrot parrotOne = new Parrot();
        Radio radioOne = new Radio();
        Firework fireworkTwo = new Firework();
        Parrot parrotTwo = new Parrot();
        Radio radioTwo = new Radio();

        List<Sound> sounds = new LinkedList<>();
        sounds.add(fireworkOne);
        sounds.add(parrotOne);
        sounds.add(radioOne);
        sounds.add(fireworkTwo);
        sounds.add(parrotTwo);
        sounds.add(radioTwo);

        for(Sound sound : sounds){
            sound.playSound();
        }
    }
}
