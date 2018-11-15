package Bunnies;

public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEars(10));
  }

  public static int bunnyEars(int bunnies) {
    if (bunnies == 1) {
      return 2;
    }
    return bunnyEars(bunnies - 1) + 2;
  }
}
