package PeakSoftCourse.FirstStage.FirstStage;

public class Student extends Person {


    private  String school;
    private boolean relationship;

    public Student(String name, int age, String gender, String school, boolean relationship) {
        super(name, age, gender);
        this.school = school;
        this.relationship = relationship;
    }

    public String toString() {
        return "name: " + getName() + "\nage: " + getAge() + "\ngender: " + getGender() + "\nschool: " + school + "\ninRelationship: " + relationship;
    }

}
