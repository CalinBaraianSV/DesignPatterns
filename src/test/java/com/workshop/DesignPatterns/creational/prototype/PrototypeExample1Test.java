package com.workshop.DesignPatterns.creational.prototype;

import com.workshop.DesignPatterns.creational.prototype.example1.Sheep;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeExample1Test {

    @Test
    public void testBondCloning() {
        Sheep originalSheep = new Sheep("Dolly", 2);
        Sheep clonedSheep =  originalSheep.clone();

        assertNotSame(originalSheep, clonedSheep); // Ensure they are different objects
        assertEquals(originalSheep.getName(), clonedSheep.getName());
        assertEquals(originalSheep.getNumberOfEyes(), clonedSheep.getNumberOfEyes(), 0.001);
    }
}
