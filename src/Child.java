public class Child extends Person {

    private String kindergarten;
    private String parentsName;

    public Child(String name, int age, String gender, String kindergarten, String parentsName) {
        super(name, age, gender);
        this.kindergarten = kindergarten;
        this.parentsName = parentsName;
    }

    public String toString() {
        return "name: " + getName() + "\nage: " + getAge() + "\ngender: " + getGender() + "\ngarden he/she goes:" + kindergarten + "\nparent's name: " + parentsName;
    }

}
