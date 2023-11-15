package com.workshop.DesignPatterns.creational.prototype.example2;

import lombok.Getter;

@Getter
public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private SomePersonProperty property;

    public Person(String name, String gender, String dateOfBirth, SomePersonProperty property) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.property = property;
    }

    // Copy constructor for a deep copy
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.gender = otherPerson.gender;
        this.dateOfBirth = otherPerson.dateOfBirth;
        this.property = new SomePersonProperty(otherPerson.property); // Deep copy, assuming SomePersonProperty has a copy constructor
    }


    public Person(Person otherPerson, String newDateOfBirth) {
        this.name = otherPerson.name;
        this.gender = otherPerson.gender;
        this.dateOfBirth = newDateOfBirth;
    }

}
