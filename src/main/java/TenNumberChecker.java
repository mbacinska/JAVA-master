public class TenNumberChecker {

  public static boolean hasTeen(int first, int second, int third) {

    if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
      return true;
    } else
      return false;
  }

  public static void main(String[] args) {
    boolean result = hasTeen(22,23,34);
    System.out.println(result);
  }
}
