package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";


    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> list = new ArrayList<>(Files.readAllLines(path, charset));
        Map<String, String> flights = new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> destinations = new ArrayList<>();

        for (String line : list) {
            String[] trip = line.split("->");
            String from = trip[0].trim();
            String to = trip[1].trim();

            if (!cities.contains(from)) {
                cities.add(from);
                flights.put(from, to);

            }

        }

        System.out.println(cities);
        System.out.println(flights);
    }

}
