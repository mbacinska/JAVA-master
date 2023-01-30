import java.util.Arrays;
import java.util.Scanner;

public class MinElement {

  public static void main(String[] args) {

    findMin(readIntegers(6));
  }

  public static int[] readIntegers(int count) {

    System.out.println("Enter " + count + " numbers");
    int[] array = new int[count];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < count; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println(Arrays.toString(array));
    return array;
  }

  public static int findMin(int arr[]) {

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < max) {
        max = arr[i];
      }
    }
    System.out.println("The minimum of your array is " + max);
    return max;
  }
}
