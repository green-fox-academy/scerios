package BunniesAgain;

public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(bunnyEars(10));
  }

  public static int bunnyEars(int bunnies) {
    if (bunnies == 1) {
      return 3;
    } else if (bunnies % 2 == 0) {
      return bunnyEars( bunnies- 1) + 2;
    } else
      return bunnyEars(bunnies - 1) + 3;
  }
}

