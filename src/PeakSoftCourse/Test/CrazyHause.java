package PeakSoftCourse.Test;

import java.util.Arrays;

public class CrazyHause extends Hause {
    public CrazyHause(long id, String name, String address, int price, int year, Person[] person) {
        super(id, name, address, price, year, person);
    }

    @Override
    public void city() {

    }

    @Override
    public void electricity() {
        super.electricity();
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
