package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        String[] array2 = {"Audi:Germany", "BMW:Germany", "Honda:Japan", "Mercedes:Germany", "VolksWagen:Germany", "Mercedes:Germany", "Tesla:USA"};
        Map<String, String> map = new HashMap<>();
        for (String str : array2) {
            String[] cars = str.split(":");
            map.put(cars[0], cars[1]);
        }
        System.out.println(map);
    }
}
