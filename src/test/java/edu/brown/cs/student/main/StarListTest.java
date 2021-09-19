package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StarListTest {
  @Test
  public void testSimpleGetStarByNameAndRemoveStar() {
    Star star1 = new Star(1, "Star1", 2.0, 1.0, 3.0);
    Star star2 = new Star(1, "Star2", 1.0, 1.0, 3.0);
    StarList starList = new StarList(new ArrayList<Star>(Arrays.asList(star1, star2)));
    Star star1Result = starList.getStarByName("Star1");
    assertEquals(star1, star1Result);
    assertEquals(1, star1Result.getStarID());
    assertEquals(false, star1Result.equals(star2));
    starList = starList.removeStar(star1Result);
    assertEquals(1, starList.size());
    Star star1ResultPostRemoval = starList.getStarByName("Star1");
    assertEquals(null, star1ResultPostRemoval);
  }

  @Test
  public void testLongStarList() {
    CsvParser csvParser = new CsvParser("data/stars/ten-star.csv");
    StarList starList = csvParser.makeStarList();
    Star starResult = starList.getStarByName("Proxima Centauri");
    starList.removeStar(starResult);
    assertEquals(9, starList.size());
  }
}