package stqa.sandbox;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by maxim on 6/17/2018.
 */
public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
