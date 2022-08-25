package PeakSoftCourse.FirstStage.FirstStage;

public class Persons {
    private String name;
    private String designation;

    public Persons(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    public void learn() { System.out.println("I can learn!"); }

    public void walk() { System.out.println("I can walk!"); }

    public void eat() { System.out.println("I can eat!"); }

    String getName() { return name; }
    String getDesignation() { return designation; }

}
