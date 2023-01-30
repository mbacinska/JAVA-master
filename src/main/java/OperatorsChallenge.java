public class OperatorsChallenge {
  public static void main(String[] args) {
    double firstValue = 20.00;
    double secondValue = 80.00;
    boolean result = ((firstValue + secondValue) * 100) % 40 == 0 ? true : false;
    System.out.println("Result: " + result);

    if(!result){
      System.out.println("Got some remainder");
    }
  }

}
