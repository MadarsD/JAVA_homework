package io.codelex.classesandobjects.practice.Exercise_7;

public class Dog {
    private final String name;
    public Sex sex;
    private String mother;
    private String father;

    public Dog(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        }
        return getFather();
    }


    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother == null) {
            return false;
        }
        return this.mother.equals(otherDog.getMother());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
