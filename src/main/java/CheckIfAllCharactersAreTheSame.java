public class CheckIfAllCharactersAreTheSame {

  public static void main(String[] args) {

    String s1 = "mmmmmmmm";
    checkIfAllCharactersAreTheSame(s1);
  }

  private static boolean checkIfAllCharactersAreTheSame(String s) {

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(0)) {
        System.out.println("No");
        return false;
      }
    }
    System.out.println("Yes");
    return true;
  }

}
