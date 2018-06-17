package stqa.sandbox;

/**
 * Created by maxim on 6/17/2018.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle() {
  }

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}
