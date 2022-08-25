package PeakSoftCourse.Test;

import java.util.Arrays;

public abstract class Hause {
    public long id;
    public String name;
    public String address;
    public int price;
    public int year;
    Person[] person;

    public Hause(long id, String name, String address, int price, int year, Person[] person) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
        this.year = year;
        this.person = person;
    }
    public abstract void city();

    public void electricity() {
        System.out.println("electr togu ar bir adam aiyna 150som toloit");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String ch = "r";
        String ch2 = "o";
        String ch3 = "b";
        String ch4 = "m";
        String ch5 = "w";
        String ch6 = "h";
        if (name.indexOf(ch) != -1 || name.indexOf(ch2) != -1 || name.indexOf(ch3) != -1 || name.indexOf(ch4) != -1 || name.indexOf(ch5) != -1 || name.indexOf(ch6) != -1 ) {
            this.name = name;
        } else {
            System.out.println("Ui kabyl alynbait, bizdin shart boiuncha bilsun");
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if ( price > 70000 ) {
            this.price = price;
        } else {
            System.out.println("baasy tuura kelbeit");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ( year > 2015 ) {
            this.year = year;
        } else {
            System.out.println("Sizdin uiunuz eski");
        }

    }

    @Override
    public String toString() {
        return "Hause{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}
