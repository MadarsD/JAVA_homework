package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> countries = new ArrayList<>();

        //TODO: Add 10 values to list
        countries.add("Latvia");
        countries.add("Estonia");
        countries.add("Lithuania");
        countries.add("Finland");
        countries.add("Sweden");
        countries.add("Norway");
        countries.add("Poland");
        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");

        //TODO: Add new value at 5th position
        countries.add(4, "Belgium");

        //TODO: Change value at last position (Calculate last position programmatically)
        countries.set(countries.size() - 1, "Spain");

        //TODO: Sort your list in alphabetical order
        Collections.sort(countries);

        //TODO: Check if your list contains "Foobar" element
        if (countries.contains("Foobar")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

        //TODO: Print each element of list using loop
        for (String country : countries) {
            System.out.println(country);
        }
    }

}
