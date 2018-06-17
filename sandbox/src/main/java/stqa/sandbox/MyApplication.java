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

    Point a = new Point(1, 0);
    Point b = new Point(10, 0);

    System.out.println("Distance between points " + a.toString() + " and " + b.toString() + " is: " + distance(a,b));
    System.out.println("Distance from " + a.toString() + " to " + b.toString() + " is: " + a.distanceToOtherPoint(b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((Math.pow((p2.x - p1.x), 2)) + (Math.pow((p2.y - p1.y), 2)));
  }
}
