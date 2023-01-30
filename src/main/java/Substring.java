public class Substring {

  public static String getSubstring(String s, int k) {
    System.out.println(s.substring(2, k));
    return s.substring(0, k);
  }

  public static void compareStrings(String s1, String s2) {
    int result = s1.compareTo(s2);
    if (result > 0) {
      System.out.println(s1 + " is first");
    } else if (result < 0) {
      System.out.println(s2 + " is first");
    } else if (result == 0) {
      System.out.println(s1 + " and " + s2 + " are equal ");
    }
  }

  public static void main(String[] args) {
    getSubstring("Konstantynool", 10);
    compareStrings("Koń", "Abażur");
  }
}
