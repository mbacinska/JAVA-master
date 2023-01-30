public class FeetAndInchesCalculations {

  public static void main(String[] args) {

    // calcFeetAndInchesToCentimeters(60, -10.0);

    double result2 = calcFeetAndInchesToCentimeters(157);
    System.out.println(result2);
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

    if (feet >= 0 && (inches >= 0 && inches <= 12)) {
      double centimeters = (feet * 12 * 2.54) + inches * 2.54;
      System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
      return centimeters;
    } else
      System.out.println("Invalid parameters!");
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {

    if (inches >= 0) {
      double feet = (int) inches / 12;
      double remainingInches = (int) inches % 12;
      return calcFeetAndInchesToCentimeters(feet, remainingInches);

    } else return -1;
  }
}
