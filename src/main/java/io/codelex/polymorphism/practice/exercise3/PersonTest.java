package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student(10.0);
        Employee employee = new Employee("Programmer");

        System.out.println(student.display());
        System.out.println(employee.display());

        student.setFirstName("Bob");
        student.setLastName("Brown");
        student.setAddress("Denver, USA");
        student.setId(12345);

        employee.setFirstName("Adam");
        employee.setLastName("Crow");
        employee.setAddress("Toronto, Canada");

        System.out.println(student.display());
        System.out.println(employee.display());
    }


}
