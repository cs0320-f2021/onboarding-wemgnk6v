package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Class that can parse a csv file with stars and generates a StarList.
 */
public class CsvParser {
  private String fileName;

  /**
   * Constructor for CsvParser.
   *
   * @param fileName String with the location and name of a csv file containing star data
   */
  public CsvParser(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Generates StarList by reading and processing the csv file represented by fileName.
   *
   * @return a StarList with the Stars extracted from the csv file
   */
  public StarList makeStarList() {
    BufferedReader br = null;
    List<Star> starList = new ArrayList<Star>();
    try {
      br = new BufferedReader(new FileReader(fileName));
      String row = null;
      String firstRow = br.readLine();
      while ((row = br.readLine()) != null) {
        String[] columns = row.split(",");
        Star star =
            new Star(Integer.parseInt(columns[0]), columns[1], Double.parseDouble(columns[2]),
                Double.parseDouble(columns[3]), Double.parseDouble(columns[4]));
        starList.add(star);
      }
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: File not found.");
    } catch (IOException e) {
      System.out.println("ERROR: Cannot process file.");
    } catch (Exception e) {
      System.out.println("ERROR: Cannot process file.");
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return new StarList(starList);
  }
}
