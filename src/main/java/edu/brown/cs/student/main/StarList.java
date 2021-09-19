package edu.brown.cs.student.main;

import java.util.List;

public class StarList {
  private List<Star> starList;

  /**
   * StarList Constructor.
   *
   * @param listInput list of Stars.
   */
  public StarList(List<Star> listInput) {
    starList = listInput;
  }

  public int size() {
    return starList.size();
  }

  public List<Star> getStarList() {
    return starList;
  }

  /**
   * Finds and returns a Star with the input name from the StarList.
   *
   * @param name name of Star to find and return from the StarList.
   * @return the Star with the matching name if it exists, and null if it does not.
   */
  public Star getStarByName(String name) {
    for (Star star : starList) {
      if (star.getName().equals(name)) {
        return star;
      }
    }
    return null;
  }

  /**
   * Removes a Star, if present, from the StarList.
   *
   * @param star the Star to remove from the StarList.
   * @return the StarList after removal of the Star.
   */
  public StarList removeStar(Star star) {
    starList.remove(star);
    return this;
  }
}
