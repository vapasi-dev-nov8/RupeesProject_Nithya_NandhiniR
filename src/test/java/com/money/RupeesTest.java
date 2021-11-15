package com.money;

import com.money.Rupees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RupeesTest {
    @Test
    void shouldAddRupeesValue(){
        Rupees rupees1 = new Rupees(5);
        Rupees rupees2 = new Rupees(2);
        Rupees rupees3 = rupees1.addRupees(rupees2);
        Rupees rupeesSum = new Rupees(7);
        assertEquals(rupeesSum,rupees3);
    }

    @Test
    void shouldCompareIfRupeesValueIsEqual(){
        Rupees rupees1 = new Rupees(20);
        Rupees rupees2 = new Rupees(20);
        //assertEquals(rupees2,rupees1);
        assertTrue(rupees2.equals(rupees1));

    }
}