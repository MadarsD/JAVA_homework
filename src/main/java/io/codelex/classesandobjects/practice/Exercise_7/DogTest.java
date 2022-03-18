package io.codelex.classesandobjects.practice.Exercise_7;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", Sex.MALE);
        Dog rocky = new Dog("Rocky", Sex.MALE);
        Dog sparkly = new Dog("Sparkly", Sex.MALE);
        Dog buster = new Dog("Buster", Sex.MALE);
        Dog sam = new Dog("Sam", Sex.MALE);
        Dog lady = new Dog("Lady", Sex.FEMALE);
        Dog molly = new Dog("Molly", Sex.FEMALE);
        Dog coco = new Dog("Coco", Sex.FEMALE);

        max.setMother("Lady");
        max.setFather("Rocky");
        coco.setMother("Molly");
        coco.setFather("Buster");
        rocky.setMother("Molly");
        rocky.setFather("Sam");
        buster.setMother("Lady");
        buster.setFather("Sparkly");

        System.out.println(lady);
        System.out.println(molly);

        System.out.println(coco.fathersName());
        System.out.println(sparkly.fathersName());

        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(coco.hasSameMotherAs(max));
        System.out.println(sam.hasSameMotherAs(max));

    }

}
