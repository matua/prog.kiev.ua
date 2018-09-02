package JavaPro.Lesson_2.Two;
/*
Created by matua on 02.09.2018 at 12:33
*/

import java.util.Arrays;

public class BusinessCard {
    private String name;
    private String surname;
    private String[] phones;
    private String [] sites;
    private Address address;

    private static class Address {
        private String country;
        private String city;
        private String street;

        @Override
        public String toString() {
            return "\tCountry: " + country + "\n" +
                    "\tcity: " + city + "\n" +
                    "\tStreet" + street + "\n";
        }
    }

    public BusinessCard() {
    }

    public BusinessCard(String name, String surname, String[] phones, String[] sites, Address address) {
        this.name = name;
        this.surname = surname;
        this.phones = phones;
        this.sites = sites;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getSites() {
        return sites;
    }

    public void setSites(String[] sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BusinessCard of " + name + " " +
                surname + "\n" +
                "Phones: " + Arrays.toString(phones) +  "\n" +
                "Sites: " + Arrays.toString(sites) + "\n" +
                "Address:\n" + address;
    }
}