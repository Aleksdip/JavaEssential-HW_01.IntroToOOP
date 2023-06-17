package task_04.address;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setApartment(88);
        address.setCity("Stariy Ugriniv");
        address.setCountry("Ukraine");
        address.setHouse(14);
        address.setIndex(77362);
        address.setStreet("Stepana Bandery");

        System.out.println("index = " + address.getIndex() + "\ncountry = " + address.getCountry() +
                "\ncity = " + address.getCity() + "\nstreet = " + address.getStreet() +
                "\nhouse = " + address.getHouse() + "\napartment = " + address.getApartment());

    }
}
