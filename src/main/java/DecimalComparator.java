public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPaces(double first, double second) {

    first = first * 1000;
    second = second * 1000;
    int firstAsInt = (int) first;
    int secondAsInt = (int) second;
    if (firstAsInt == secondAsInt) {
      return true;
    } else
      return false;
  }

  public static void main(String[] args) {
    boolean result = areEqualByThreeDecimalPaces(-3.123, 3.123);
    System.out.println(result);
  }
}
