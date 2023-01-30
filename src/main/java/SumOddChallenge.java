public class SumOddChallenge {

  public static void main(String[] args) {

    //int result = sumOdd(3,10);
    System.out.println(sumOdd(100, 1000));
  }

  public static boolean isOdd(int number) {

    if (number <= 0) {
      return false;
    }
    if (number % 2 == 0) {
      return false;
    }
    System.out.println(number);
    return true;

  }

  public static int sumOdd(int start, int stop) {

    int sum = 0;
    if (start <= 0 || stop <= 0 || stop < start) {
      sum=-1;
      return sum;

    }
    for (int i = start; i <= stop; i++) {
      if (isOdd(i)) {
        sum += i;
      }

    }
    return sum;
  }
}
