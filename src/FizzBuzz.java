/**
 * Solves the FizzBuzz Problem.
 */
public class FizzBuzz {
  /**
   * This program plays the game "Fizzbuzz".
   * It counts to 100, replacing each multiple of 5 with the word "Buzz",
   * each multiple of 3 with the word "Fizz",
   * and each multiple of both with the word "FizzBuzz".
   * @param args Ignored.
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println(i + " FizzBuzz");
      }
      else {
        if (i % 3 == 0) {
          System.out.println(i + " Fizz");
        }
        else {
          if (i % 5 == 0) {
            System.out.println(i + " Buzz");
          }
          else {
            System.out.println(i);
          }
        }
      }
    }
  }
}
