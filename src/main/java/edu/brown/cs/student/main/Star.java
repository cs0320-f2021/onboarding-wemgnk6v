package edu.brown.cs.student.main;

import java.util.Objects;

public class Star {
  private int starID;
  private String properName;
  private Double x;
  private Double y;
  private Double z;

  /**
   * Star Constructor.
   *
   * @param starIDInput     Star ID.
   * @param properNameInput Star name.
   * @param xInput          x coordinate.
   * @param yInput          y coordinate.
   * @param zInput          z coordinate.
   */
  public Star(int starIDInput, String properNameInput, Double xInput, Double yInput,
              Double zInput) {
    starID = starIDInput;
    properName = properNameInput;
    x = xInput;
    y = yInput;
    z = zInput;
  }

  public String getName() {
    return properName;
  }

  public int getStarID() {
    return starID;
  }

  /**
   * Calculates distance between star and coordinate location.
   *
   * @param toX x coordinate.
   * @param toY y coordinate.
   * @param toZ z coordinate.
   * @return the distance between star and input coordinate.
   */
  public Double calcDistance(Double toX, Double toY, Double toZ) {
    double distance =
        Math.sqrt(Math.pow((x - toX), 2) + Math.pow((y - toY), 2) + Math.pow((z - toZ), 2));
    return distance;
  }

  public Double getX() {
    return x;
  }

  public Double getY() {
    return y;
  }

  public Double getZ() {
    return z;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Star star = (Star) o;
    return starID == star.starID && Objects.equals(properName, star.properName)
        &&
        Objects.equals(x, star.x) && Objects.equals(y, star.y)
        &&
        Objects.equals(z, star.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starID, properName, x, y, z);
  }
}
