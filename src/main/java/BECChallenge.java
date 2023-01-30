public class BECChallenge {

  public static int evenNumbersSum(int n) {

    int sum = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
        System.out.println(i);
      }

    }
    return sum;
  }

  public static void main(String[] args) {

    System.out.println("Sum is: " + evenNumbersSum(10));
  }

}
