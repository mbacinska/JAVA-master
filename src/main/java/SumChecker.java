public class SumChecker {

  public static boolean hasEqualSum(int first, int second, int third) {

    if (first + second == third) {
      return true;
    } else
      return false;
  }

  public static void main(String[] args) {
    boolean result = hasEqualSum(1,-1,0);
    System.out.println(result);
  }
}
