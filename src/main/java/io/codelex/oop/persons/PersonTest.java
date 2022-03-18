package io.codelex.oop.persons;

public class PersonTest {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Brown", "123", 30, "Accountant", 1923, 2);
        System.out.println("Work experience in years: " + john.getWorkExperience());
        System.out.println("Employee info: " + john.getInfo());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Customer peter = new Customer("Peter", "Brown", "1234", 22, "CID1234");
        peter.setPurchaseCount(33);
        System.out.println("Purchase count: " + peter.getPurchaseCount());
        System.out.println("Customer info: " + peter.getInfo());
    }

}
