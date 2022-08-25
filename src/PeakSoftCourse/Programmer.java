package PeakSoftCourse.FirstStage.FirstStage;

import PeakSoftCourse.FirstStage.FirstStage.Persons;

public class Programmer extends Persons {
    private String companyName;



    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;

    }




    public  void coding(){
        System.out.println("I can coding!");
    }

    @Override
    public void walk() {
        System.out.println("step by step");
    }

    @Override
    public String toString() {
        return  "the work plaece: " + companyName ;
    }
}
