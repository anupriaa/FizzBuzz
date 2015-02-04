/**
 * Created by Anupriya on 2/4/2015.
 */
public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0)
        System.out.println(i + " Fizz");
      if (i % 5 == 0)
        System.out.print(i + " Buzz");
      if ((i % 3 == 0) && (i % 5 == 0))
        System.out.print(i + " FizzBuzz");
      if ((i % 3 != 0) && (i % 5 != 0))
        System.out.print(i);
    }
  }
}
