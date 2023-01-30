import java.util.ArrayList;

public class ArrayListExamples {

  public static void main(String[] args) {

    int n = 5;
    ArrayList<Integer> myArrList = new ArrayList<Integer>(n);

    System.out.println("My array list size is: " + myArrList.size());

    printArrayList(myArrList);
    System.out.println("If my array list is empty: " + myArrList.isEmpty());

    for (int i = 0; i < n; i++) {
      myArrList.add(i);
    }
    System.out.println("My array list size after adding elements is: " + myArrList.size());
    printArrayList(myArrList);
    System.out.println("If my array list is empty: " + myArrList.isEmpty());

    myArrList.remove(0);

    System.out.println("My array list size after removing element is: " + myArrList.size());

    printArrayList(myArrList);

    myArrList.add(0, 100);

    printArrayList(myArrList);

    System.out.println(myArrList.contains(100));
    System.out.println(myArrList.contains(200));

    ArrayList<Integer> mySecondArrList = new ArrayList<Integer>();

    System.out.println("My second array list size is: " + mySecondArrList.size());

  }

  private static void printArrayList(ArrayList<Integer> array) {
    System.out.println("My array list is: " + array);
  }

}
