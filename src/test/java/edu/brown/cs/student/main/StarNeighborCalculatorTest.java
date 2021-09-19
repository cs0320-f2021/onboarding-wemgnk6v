package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarNeighborCalculatorTest {
  // code a few of the system tests
  @Test
  public void testZeroK() {
    CsvParser csvParser = new CsvParser("data/stars/three-star.csv");
    StarList starList = csvParser.makeStarList();
    StarNeighborCalculator caclulator =
        new StarNeighborCalculator(starList, 0, 12.0025, 1.0257, -105.5236);
    caclulator.printKNN();
    List<StarNeighborCalculator.StarDistance> distList = caclulator.getDistanceList();
    assertEquals(3, distList.size());
  }

  @Test
  public void testGreaterKThanStarListSize() {
    CsvParser csvParser = new CsvParser("data/stars/one-star.csv");
    StarList starList = csvParser.makeStarList();
    StarNeighborCalculator caclulator =
        new StarNeighborCalculator(starList, 2, 12.0025, 1.0257, -105.5236);
    caclulator.printKNN();
    List<StarNeighborCalculator.StarDistance> distList = caclulator.getDistanceList();
    assertEquals(1, distList.size());
  }
}

