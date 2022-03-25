package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person{

    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String display() {
        return super.display() + ", jobTitle = " + jobTitle;
    }
}
