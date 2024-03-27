import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testLengthOne(){

    assertFalse(c.compute(5));
  }
  @Test
  public void testDivisibleByTwo(){

    assertFalse(c.compute(5,10));
  }
  @Test(expected = RuntimeException.class)
  public void testEmptyLength(){

    assertFalse(c.compute(1,0,2));
  }
  @Test
  public void testSumDivisible(){

    assertTrue(c.compute(5,10,3));
  }
  @Test
  public void testSumNotDivisible(){

    assertFalse(c.compute(5,10,2));
  }
}