package io.codelex.oop.computers;

public class ComputersTest {
    public static void main(String[] args) {
        Computer lenovo = new Computer("Intel Core i5-11400F", 16, "NVIDIA GeForce RTX 3060", "Lenovo", "Legion T5 26IOB6");
        Computer lenovoCopy = new Computer("Intel Core i5-11400F", 16, "NVIDIA GeForce RTX 3060", "Lenovo", "Legion T5 26IOB6");
        Computer fakeLenovo = new Computer("Intel Core i5-11400F", 16, "NVIDIA GeForce RTX 3060", "Lenovo", "Legion T5 26IOB6");
        Computer hp = new Computer("Intel® Core™ i5 4570", 8, "Intel HD", "HP", "ProDesk 600 G1");
        Computer dell = new Computer("Intel® Core™ i5 4570", 32, "AMD Radeon RX560", "Dell", "7020 MT");
        Computer apple = new Computer("Apple M1", 8, "Apple M1", "Apple", "iMac 24 4.5K M1");

        Laptop asus = new Laptop("Intel® Core™ i3-10110U", 8, "Intel UHD", "Asus", "X515FA-BQ059T", "Li-ion 2 cell 37 Whr");
        Laptop asusCopy = new Laptop("Intel® Core™ i3-10110U", 8, "Intel UHD", "Asus", "X515FA-BQ059T", "Li-ion 2 cell 37 Whr");
        Laptop fakeAsus = new Laptop("Intel® Core™ i3-10110U", 8, "Intel UHD", "Asus", "X515FA-BQ059T", "Li-ion 2 cell 37 Whr");
        Laptop msi = new Laptop("Intel® Core™ i7-11800H", 16, "NVIDIA GeForce RTX 3070", "MSI", "Raider GE76 11UG-065NL", "Li-ion 4 cell");

        System.out.println(lenovo.getCompany());
        System.out.println(lenovo.getProcessor());
        System.out.println(lenovo.getGraphicsCard());
        System.out.println(lenovo.getRam());
        System.out.println(lenovo.getModel());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        fakeLenovo.setCompany("Lemono");
        fakeLenovo.setProcessor("Ginter A5");
        fakeLenovo.setGraphicsCard("VIVIDIA Force X1");
        fakeLenovo.setRam(100);
        fakeLenovo.setModel("Batallion T10");

        System.out.println(fakeLenovo.getCompany());
        System.out.println(fakeLenovo.getProcessor());
        System.out.println(fakeLenovo.getGraphicsCard());
        System.out.println(fakeLenovo.getRam());
        System.out.println(fakeLenovo.getModel());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println(lenovo);
        System.out.println(fakeLenovo);
        System.out.println(dell);
        System.out.println(hp);
        System.out.println(apple);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println(lenovo.equals(lenovoCopy));
        System.out.println(lenovo.equals(fakeLenovo));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //Laptop test
        System.out.println(asus.getCompany());
        System.out.println(asus.getProcessor());
        System.out.println(asus.getGraphicsCard());
        System.out.println(asus.getRam());
        System.out.println(asus.getModel());
        System.out.println(asus.getBatteryType());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        fakeAsus.setCompany("Usas");
        fakeAsus.setProcessor("Infel i6");
        fakeAsus.setGraphicsCard("Infel HD");
        fakeAsus.setRam(10);
        fakeAsus.setModel("X51F-BQ9T");
        fakeAsus.setBatteryType("Li-ion Turbo 30");

        System.out.println(fakeAsus.getCompany());
        System.out.println(fakeAsus.getProcessor());
        System.out.println(fakeAsus.getGraphicsCard());
        System.out.println(fakeAsus.getRam());
        System.out.println(fakeAsus.getModel());
        System.out.println(fakeAsus.getBatteryType());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println(asus);
        System.out.println(fakeAsus);
        System.out.println(msi);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println(asus.equals(fakeAsus));
        System.out.println(asus.equals(asusCopy));

    }
}
