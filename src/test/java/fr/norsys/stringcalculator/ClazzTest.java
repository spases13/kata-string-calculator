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


}