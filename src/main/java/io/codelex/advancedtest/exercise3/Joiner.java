package io.codelex.advancedtest.exercise3;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... object){
        return Arrays.stream(object).map(Object::toString).collect(Collectors.joining(separator));
 }



}
