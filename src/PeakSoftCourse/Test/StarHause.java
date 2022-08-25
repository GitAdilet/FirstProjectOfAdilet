package PeakSoftCourse.Test;

import java.util.Arrays;

public class StarHause extends Hause {
    public StarHause(long id, String name, String address, int price, int year, Person[] person) {
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
        return "FashTeamHause{" +
                "person=" + Arrays.toString(person) +
                '}';
    }
}
