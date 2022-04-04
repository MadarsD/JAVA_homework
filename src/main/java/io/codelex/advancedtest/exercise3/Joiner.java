package io.codelex.advancedtest.exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... objects){
        return Arrays.stream(objects).map(Object::toString).collect(Collectors.joining(separator));
 }



}
