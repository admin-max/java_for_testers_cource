package stqa.sandbox;

class MyApplication {

  public static void main(String[] args) {

    hello("world");
    hello("John");
    hello("Alex");

    double l = 5;
    System.out.println("Square area with " + l + " side is: " + area(l));

    double a = 3;
    double b = 4;
    System.out.println("Rectangle square area with " + a + " and " + b + " sides is: " + area(a, b));

  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}