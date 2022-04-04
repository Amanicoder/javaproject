package org.humanbooster.myproject.carproject;

public class OwnerInfo {
    private String firstName;
    private String lastName;

    public OwnerInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "OwnerInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
