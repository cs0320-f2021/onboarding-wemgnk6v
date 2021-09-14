package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class CsvParser {
    String fileName;

    public CsvParser(String fileName){
        fileName = fileName;
    }

    // outputs a StarList
    // public or private?
    public StarList makeStarList() {
        BufferedReader br = null;
        List<Star> starList = new LinkedList<Star>();
        try {
            // TO DO: SKIP FIRST ROW
            br = new BufferedReader(new FileReader(fileName));
            String row = null;
            while ((row = br.readLine()) != null) {
                String[] columns = row.split(",");
                Star star = new Star(Integer.parseInt(columns[0]), columns[1], Double.parseDouble(columns[2]),
                        Double.parseDouble(columns[3]), Double.parseDouble(columns[4]));
                starList.add(star);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
