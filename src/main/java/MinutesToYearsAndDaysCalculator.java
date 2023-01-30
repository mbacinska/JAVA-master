public class MinutesToYearsAndDaysCalculator {

  public static void main(String[] args) {
    printYearsAndDays(561600);
  }

  private static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value.");
    } else {
      long years = minutes / 525600;
      long remainingDays = (minutes % 525600) / 1440;
      System.out.println(minutes + " min" + " = " + years + " y" + " and " + remainingDays + " d");
    }
  }
}
