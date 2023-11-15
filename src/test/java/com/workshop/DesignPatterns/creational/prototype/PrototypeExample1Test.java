package com.workshop.DesignPatterns.creational.prototype;

import com.workshop.DesignPatterns.creational.prototype.example1.Bond;
import com.workshop.DesignPatterns.creational.prototype.example1.Stock;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeExample1Test {

    @Test
    public void testStockCloning() {
        Stock originalStock = new Stock("AAPL", 150.00);
        Stock clonedStock = (Stock) originalStock.clone();

        assertNotSame(originalStock, clonedStock); // Ensure they are different objects
        assertEquals(originalStock.getTicker(), clonedStock.getTicker());
        assertEquals(originalStock.getPrice(), clonedStock.getPrice(), 0.001);
    }

    @Test
    public void testBondCloning() {
        Bond originalBond = new Bond("US Treasury", 1.5);
        Bond clonedBond = (Bond) originalBond.clone();

        assertNotSame(originalBond, clonedBond); // Ensure they are different objects
        assertEquals(originalBond.getIssuer(), clonedBond.getIssuer());
        assertEquals(originalBond.getInterestRate(), clonedBond.getInterestRate(), 0.001);
    }
}
