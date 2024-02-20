package fr.norsys.stringcalculator;

/**
 * ClazzTest
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClazzTest {

    @Test
    public void checkAddWithEmptyString() {
        Clazz c = new Clazz();
        int result = c.Add("");
        assertEquals(0, result);
    }

    @Test
    public void checkAddWithSingleNumber() {
        Clazz c = new Clazz();
        int result = c.Add("5");
        assertEquals(5, result);
    }

    @Test
    public void checkAddWithTwoNumbers() {
        Clazz c = new Clazz();
        int result = c.Add("3,7");
        assertEquals(10, result);
    }

    @Test
    public void checkAddWithNewLineDelimiter() {
        Clazz c = new Clazz();
        int result = c.Add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void checkAddWithNewLineOnly() {
        Clazz c = new Clazz();
        int result = c.Add("1\n3");
        assertEquals(4, result);
    }

    // @Test
    // public void checkAddWithNewLineAndCommaAttachedOnly() {
    //     Clazz c = new Clazz();
    //     int result = c.Add("2,\n3");
    //     assertEquals(5, result);
    // }

    @Test
    public void checkHasNewDeliemeter() {
        Clazz c = new Clazz();
        boolean test1 = c.hasNewDeliemeter("//;\n1;2");
        boolean test2 = c.hasNewDeliemeter(";\n1;2");
        assertEquals(true, test1);
        assertEquals(false, test2);
    }

    @Test
    public void checkGetDeliemeterFromString() {
        Clazz c = new Clazz();
        String result = c.getDeliemeterFromString("//;\n1;2");
        assertEquals(";", result);
    }

}