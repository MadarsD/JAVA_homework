package io.codelex.oop.cars;

public class CarServiceTest {
    public static void main(String[] args) {

        CarService service = new CarService();

        Car audi = new Car("Audi", "A6", 49999.99, 2021, engineType.V8);
        Car skoda = new Car("Skoda", "Fabia", 13499.53, 2018, engineType.S4);
        Car bmw = new Car("BMW", "M5", 70000, 2021, engineType.V12);
        Car ferrari = new Car("Ferrari", "F430", 120000, 2020, engineType.V12);
        Car ford = new Car("Ford", "Focus", 20000, 2022, engineType.S3);
        Car opel = new Car("Opel", "Vectra", 5999, 1998, engineType.S6);
        Car opel2 = new Car("Opel", "Omega", 8000, 2010, engineType.S6);
        Car honda = new Car("Honda", "Civic", 7980, 2011, engineType.V6);
        Car lada = new Car("Lada", "Niva", 2199, 1997, engineType.V8);

        Manufacturer riga = new Manufacturer("Riga", 1991, "Latvia");
        Manufacturer riga2 = new Manufacturer("Riga", 1991, "Latvia");
        Manufacturer berlin = new Manufacturer("Berlin", 1977, "Germany");
        Manufacturer paris = new Manufacturer("Paris", 2002, "France");
        Manufacturer oslo = new Manufacturer("Oslo", 1954, "Norway");
        Manufacturer madrid = new Manufacturer("Madrid", 2005, "Spain");

        audi.addManufacturer(berlin);
        audi.addManufacturer(riga);
        audi.addManufacturer(madrid);
        bmw.addManufacturer(paris);
        bmw.addManufacturer(riga2);
        ford.addManufacturer(oslo);
        honda.addManufacturer(madrid);
        lada.addManufacturer(riga);



        service.addCars(audi);
        service.addCars(bmw);
        service.addCars(ford);
        service.addCars(skoda);
        service.addCars(ferrari);
        service.addCars(opel);
        service.addCars(opel2);
        service.addCars(honda);
        service.addCars(lada);

        service.removeCars(opel2);

        service.printAllCars();

        System.out.println();
        service.printV12();

        System.out.println();
        service.olderThan1999();

        System.out.println();
        service.mostExpensiveCar();

        System.out.println();
        service.cheapestCar();

        System.out.println();
        service.atLeastThreeManufacturers();

        System.out.println();
        service.sortedByPrice("descending");
        service.sortedByYearOfManufacture("ascending");


        System.out.println();
        System.out.println(service.checkIfCarIsOnList(audi));
        System.out.println(service.checkIfCarIsOnList(opel2));

        System.out.println();
        service.findByManufacturer(riga);
        service.findByManufacturer(berlin);

        System.out.println();
        service.carsByManufacturer(riga,2000);







    }
}
