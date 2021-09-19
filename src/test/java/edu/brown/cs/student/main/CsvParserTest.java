package edu.brown.cs.student.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CsvParserTest {
  @Test
  public void testFileNotFound() {
    CsvParser csvParser = new CsvParser("data/stars/no-file.csv");
    StarList starList = csvParser.makeStarList();
    assertEquals(0, starList.size());
  }
}
