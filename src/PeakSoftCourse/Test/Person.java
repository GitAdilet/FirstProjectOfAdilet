package PeakSoftCourse.Test;


import java.util.Random;
import java.util.Scanner;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private long phoneNumber;

    public Person( long id, String firstName, String lastName, String email, int age, long phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void work() {
        System.out.println();
    }

    public void timetable() {
        System.out.println(firstName + "Kaisy jumushta ishtiet");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String  sub = "@";
        if (email.indexOf(sub) != -1) {
            this.email = email;
        } else {
            System.out.println("@ - jok! kairadan teksheriniz!");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 110 && age >= 0 ) {
            this.age = age;
        } else {
            System.out.println("Ters san beruugo jana jok jash beruugo bolboit");
        }

    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        boolean start;
        String longToString = String.valueOf(phoneNumber);
        if ( start = longToString.startsWith("+996")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("kyrgyz nomer beriniz");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
