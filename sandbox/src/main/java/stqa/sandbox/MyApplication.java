package stqa.sandbox;

class MyApplication {

  public static void main(String[] args) {

    hello("World");
    hello("John");
    hello("Alex");

    Square s = new Square(5);

    System.out.println("Square area with " + s.l + " side is: " + s.area());

    Rectangle r = new Rectangle(3, 4);

    System.out.println("Rectangle square area with " + r.a + " and " + r.b + " sides is: " + r.area());

    Point a = new Point(3, 5);
    Point b = new Point(21, 32);

    System.out.println("Distants between points " + a.toString() + " and " + b.toString() + " is: " + distance(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((Math.pow((p2.x - p1.x), 2)) + (Math.pow((p2.y - p1.y), 2)));
  }
}