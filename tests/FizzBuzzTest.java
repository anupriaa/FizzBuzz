import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Checks the ChecksIfMultiple() method of FizzBuzz project.
 */
public class FizzBuzzTest {
  /**
   * Tests the ChecksIfMultiple() for different multiples of 3 and 5.
   * @throws Exception If error occurs.
   */
  @Test
  public void testChecksIfMultiple() throws Exception {
    assertEquals("Checks for multiple of 3" , "Fizz"  , FizzBuzz.checksIfMultiple(3));
    assertEquals("Checks for multiple of 5" , "Buzz" , FizzBuzz.checksIfMultiple(5));
    assertEquals("Checks for multiple of 3 and 5" , "FizzBuzz" , FizzBuzz.checksIfMultiple(15));
    assertEquals("Checks for not a multiple of either 3 0r 5" , "None" , FizzBuzz.checksIfMultiple(2));
  }
}