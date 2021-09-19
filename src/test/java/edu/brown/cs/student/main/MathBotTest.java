package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  // TODO: add more unit tests of your own
  @Test
  public void testSubtractionNegativeArgs() {
    MathBot matherator9003 = new MathBot();
    double output = matherator9003.subtract(-5, -18);
    assertEquals(13, output, 0.01);
  }

  @Test
  public void testSubtractionNegativeResult() {
    MathBot matherator9004 = new MathBot();
    double output = matherator9004.subtract(5, 10);
    assertEquals(-5, output, 0.01);
  }

  @Test
  public void testSubtractionDecimalArgs() {
    MathBot matherator9005 = new MathBot();
    double output = matherator9005.subtract(5, 1.5);
    assertEquals(3.5, output, 0.01);
  }

  @Test
  public void testAdditionDecimalArgs() {
    MathBot matherator9006 = new MathBot();
    double output = matherator9006.add(2.1, 3.2);
    assertEquals(5.3, output, 0.01);
  }

  @Test
  public void testAdditionNegativeArgs() {
    MathBot matherator9007 = new MathBot();
    double output = matherator9007.add(-5, -4);
    assertEquals(-9, output, 0.01);
  }
}
