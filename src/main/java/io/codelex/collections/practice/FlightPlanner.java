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
    final Path path = Paths.get(Histogram.class.getResource(file).toURI());
    List<String> list = new ArrayList<>(Files.readAllLines(path, charset));

    Map<String, ArrayList<String>> flights = new HashMap<>();
    static final ArrayList<String> cities = new ArrayList<>();


    public FlightPlanner() throws IOException, URISyntaxException {
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> route = new ArrayList<>();
        FlightPlanner planner = new FlightPlanner();

        planner.readFlightEntry();
        System.out.println("what would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press #");
        String input = scanner.nextLine();

        while (true) {
            if (input.equals(String.valueOf(1))) {
                planner.displayListOfCities(cities);
            } else if (input.equals("#")) {
                System.out.println("Good bye!");
                break;
            }

            System.out.println("Enter a city from which you would like to start your trip: ");
            String startCity = scanner.nextLine();
            route.add(startCity);
            String current = startCity;
            while (true) {
                String nextCity = planner.getNextCity(current);
                route.add(nextCity);
                if (nextCity.equals(startCity)) break;
                current = nextCity;
            }
            planner.printRoute(route);
            break;
        }


    }

    public void defineCity(String cityName) {
        if (!cities.contains(cityName)) {
            cities.add(cityName);
            flights.put(cityName, new ArrayList<>());
        }
    }

    private ArrayList<String> getDestinations(String fromCity) {
        return flights.get(fromCity);
    }

    public void readFlightEntry() throws IOException {
        for (String line : list) {
            String[] cities = line.split("->");
            String fromCity = cities[0].trim();
            String toCity = cities[1].trim();
            defineCity(fromCity);
            defineCity(toCity);
            getDestinations(fromCity).add(toCity);
        }
    }

    public void displayListOfCities(ArrayList<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public String getNextCity(String city) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> destinations = getDestinations(city);
        String nextCity;
        System.out.println("From " + city + " you can fly directly to:");
        displayListOfCities(destinations);
        while (true) {
            System.out.println("Where do you want to go from " + city + "? ");
            nextCity = scanner.nextLine();
            if (!destinations.contains(nextCity)) {
                System.out.println("Invalid city name or these cities are not connected by direct flight");
            } else {
                break;
            }
        }
        System.out.println(nextCity);
        return nextCity;
    }

    public void printRoute(ArrayList<String> route) {
        System.out.println("The route you have chosen for this trip is: ");
        for (int i = 0; i < route.size(); i++) {
            if (i == route.size() - 1) {
                System.out.print(route.get(i));
            } else {
                System.out.print(route.get(i) + " -> ");
            }

        }
    }

}
