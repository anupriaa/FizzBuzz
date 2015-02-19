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
    String word;
    for (int i = 1; i <= 100; i++) {
      word = checksIfMultiple(i);
      if (!word.equalsIgnoreCase("NONE")) {
        System.out.println(i + word);
      }
      else {
        System.out.println(i);
      }
    }
  }

  /**
   * Replaces each multiple with appropriate word.
   * each multiple of 5 with the word "Buzz",
   * each multiple of 3 with the word "Fizz",
   * and each multiple of both with the word "FizzBuzz".
   * @param i The count to be checked.
   * @return the word to be printed.
   */
  public static String checksIfMultiple(int i) {
    if ((i % 3 == 0) && (i % 5 == 0)) {
      return ("FizzBuzz");
    }
    else {
      if (i % 3 == 0) {
        return ("Fizz");
      }
      else {
        if (i % 5 == 0) {
          return ("Buzz");
        }
        else {
          return ("None");
        }
      }
    }
  }
}
