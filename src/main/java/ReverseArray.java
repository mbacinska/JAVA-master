import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

  public static void main(String[] args) {

//    int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    System.out.println(Arrays.toString(myArr));
//    reverse(myArr);
    List<Integer> myArr2 = new ArrayList<>();
    myArr2.add(1);
    myArr2.add(2);
    myArr2.add(3);
    myArr2.add(4);
    myArr2.add(5);
    myArr2.add(6);
    myArr2.add(7);
    myArr2.add(8);
    myArr2.add(9);
    System.out.println(myArr2);
    reverse2(myArr2);

  }

  private static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  private static void reverse2(List<Integer> arr) {
    Collections.reverse(arr);
    System.out.println(arr);

  }
}
