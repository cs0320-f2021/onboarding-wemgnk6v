package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StarTest {
  @Test
  public void testCalcDistance1() {
    Star star1 = new Star(1, "Star1", 2.0, 1.0, 3.0);
    Star star2 = new Star(1, "Star2", 1.0, 1.0, 3.0);
    double distance = star1.calcDistance(star2.getX(), star2.getY(), star2.getZ());
    assertEquals(1.0, distance, 0.01);
  }

  @Test
  public void testCalcDistance0() {
    Star star1 = new Star(1, "Star1", 2.0, 1.0, 3.0);
    Star star2 = new Star(1, "Star2", 2.0, 1.0, 3.0);
    double distance = star1.calcDistance(star2.getX(), star2.getY(), star2.getZ());
    assertEquals(0.0, distance, 0.01);
  }
}
