package io.codelex.oop.cars;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer riga = new Manufacturer("Riga", 1991, "Latvia");
        Manufacturer riga2 = new Manufacturer("Riga", 1991, "Latvia");
        Manufacturer berlin = new Manufacturer("Berlin", 1977, "Germany");
        Manufacturer paris = new Manufacturer("Paris", 2002, "France");

        System.out.println(riga.getName());
        System.out.println(riga.getCountry());
        System.out.println(riga.getYearOfEstablishment());
        System.out.println(riga.equals(berlin));
        System.out.println(riga.equals(riga2));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        Car audi = new Car("Audi", "A6", 49999.99, 2021, EngineType.V8);
        Car bmw = new Car("BMW", "M5", 70000, 2020, EngineType.V12);
        Car ford = new Car("Ford", "Focus", 20000, 2019, EngineType.S3);

        System.out.println(audi.getName());
        System.out.println(audi.getModel());
        System.out.println("The initial price was " + audi.getPrice());
        audi.setPrice(80000);
        System.out.println("The inflation comes and price is now " + audi.getPrice());
        System.out.println(audi.getYearOfManufacture());

        audi.addManufacturer(berlin);
        audi.addManufacturer(riga);
        bmw.addManufacturer(paris);
        bmw.addManufacturer(riga2);

        audi.printManufacturers();

    }
}
