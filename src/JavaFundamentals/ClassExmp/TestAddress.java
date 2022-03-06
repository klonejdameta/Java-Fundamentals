package JavaFundamentals.ClassExmp;

import java.util.ArrayList;
import java.util.List;

public class TestAddress {
    public static void main(String[] args) {

        Person person1 = new Person("Kloi", new Address(11, "Tirane", "Blue"));
        Person person2 = new Person("Kloe", new Address(6, "Tirane", "Red"));
        Person person3 = new Person("Klo", new Address(10, "Tirane", "Grey"));

        Person[] array = new Person[3];
        array[0] = person1;
        array[1] = person2;
        array[2] = person3;

        int max = -999;
        String result = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAddress().getFloor() > max) {
                max = array[i].getAddress().getFloor();
                result = array[i].getName();

            }

        }
        System.out.println("Person in the highest floor is " + result + " and floor is " + max);
    }

}

