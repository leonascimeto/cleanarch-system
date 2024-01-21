package tech.leondev.cleanarch.core.domain;

import java.util.Objects;
import java.util.UUID;

public class Address {

    private String string;

    private String city;

    private String state;

    public Address() {
    }

    public Address(String string, String city, String state) {
        this.string = string;
        this.city = city;
        this.state = state;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Address address = (Address) object;
        return Objects.equals(string, address.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
