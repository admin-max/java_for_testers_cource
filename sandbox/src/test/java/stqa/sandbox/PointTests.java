package stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by maxim on 6/17/2018.
 */
public class PointTests {

  @Test
  public void distanceToOtherPoint(){
    Point a = new Point(1,9);
    Point b = new Point(1, 1);

    Assert.assertEquals(a.distanceToOtherPoint(b), 8.0);
    Assert.assertEquals(b.distanceToOtherPoint(a), 8.0);
    Assert.assertEquals(a.distanceToOtherPoint(a), 0.0);
    Assert.assertEquals(b.distanceToOtherPoint(b), 0.0);
  }
}
