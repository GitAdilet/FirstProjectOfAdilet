package PeakSoftCourse.FirstStage.FirstStage;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    String getName() { return name; }
    int getAge() { return age; }
    String getGender() { return gender; }

    public String toString() {
        return "name: " + name +  " \nage: " + age + "\ngender: " + gender;
    }

}
