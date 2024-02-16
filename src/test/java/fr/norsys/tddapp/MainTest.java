package fr.norsys.tddapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testAdd() {
    assertEquals(5, Main.add(2, 3));
  }
  
}
