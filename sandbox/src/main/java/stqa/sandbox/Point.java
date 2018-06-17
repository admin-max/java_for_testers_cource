package stqa.sandbox;

/**
 * Created by maxim on 6/17/2018.
 */
public class Point {
  public double x;
  public double y;

  public Point() {
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[" + this.x + "," + this.y + "]";
  }
}
