package com.workshop.DesignPatterns.creational.prototype;

import com.workshop.DesignPatterns.creational.prototype.example1.Sheep;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeExample1Test {

    @Test
    public void testBondCloning() {
        Sheep originalSheep = new Sheep("Dolly", 2);
        Sheep clonedSheep =  originalSheep.clone();

        assertNotSame(originalSheep, clonedSheep);// Ensure they are different objects
        System.out.println("Original Sheep :" + originalSheep + " Clone Sheep : " + clonedSheep);
        assertEquals(originalSheep.getName(), clonedSheep.getName());
        System.out.println("Original Sheep :" + originalSheep.getName() + ". Number of eyes :" + originalSheep.getNumberOfEyes());
        System.out.println("Cloned  Sheep :" + clonedSheep.getName() + ". Number of eyes :" + clonedSheep.getNumberOfEyes());
    }
}
