

public class PrimitiveTypes {

  public static void main(String[] args) {
    int myIntNumber = 10000;
    System.out.println("My number: " + myIntNumber);
    int minValue = Integer.MIN_VALUE;
    System.out.println("Minimum: " + minValue);
    int maxValue = Integer.MAX_VALUE;
    System.out.println("Maximum: " + maxValue);
    int overFlowedValue = maxValue + 1;
    System.out.println("Overflow: " + overFlowedValue);
    int underFlowedValue = minValue - 1;
    System.out.println("Underflow: " + underFlowedValue);

    byte myByteValue = Byte.MAX_VALUE - 10;
    System.out.println("My Byte: " + myByteValue);
    short myShortValue = Short.MAX_VALUE - 100;
    System.out.println("My Short: " + myShortValue);
    int myIntValue = Integer.MAX_VALUE - 1000;
    System.out.println("My Int: " + myIntValue);
    long myLongValue = 50000L + 10 * (myByteValue + myShortValue + myIntValue);
    System.out.println("My long: " + myLongValue);

    double numberOfPounds = 100d;
    double numberOfKilograms = numberOfPounds * 0.45359237;
    System.out.println("Pound to kilograms = " + numberOfKilograms);


    boolean isAlien = false;
    if(!isAlien){
      System.out.println("Im not an Alien!");
    }
  }

}
