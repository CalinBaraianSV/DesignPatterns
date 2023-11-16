package com.workshop.DesignPatterns.creational.prototype;

import com.workshop.DesignPatterns.creational.prototype.example2.Person;
import com.workshop.DesignPatterns.creational.prototype.example2.SomePersonProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeExample2Test {

    @Test
    public void testPersonCopyConstructor() {
        SomePersonProperty property = new SomePersonProperty("SampleValue");
        Person originalPerson = new Person("John Doe", "Male", "01-01-1990", property);
        Person copiedPerson = new Person(originalPerson);

        assertNotNull(copiedPerson);
        assertEquals(originalPerson.getName(), copiedPerson.getName());
        assertEquals(originalPerson.getGender(), copiedPerson.getGender());
        assertEquals(originalPerson.getDateOfBirth(), copiedPerson.getDateOfBirth());

        // For deep copy test
        assertEquals(originalPerson.getProperty().getPropretyName(), copiedPerson.getProperty().getPropretyName());
        assertNotSame(originalPerson.getProperty(), copiedPerson.getProperty());
    }

}
