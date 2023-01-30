public class MethodsChallenge {

  public static void main(String[] args) {

    displayHighScorePosition("Martin", calculateHighScorePosition(1500));
    displayHighScorePosition("Alvin", calculateHighScorePosition(900));
    displayHighScorePosition("Kevin", calculateHighScorePosition(400));
    displayHighScorePosition("Ben", calculateHighScorePosition(50));

    System.out.println("************************************************************");

    int calculation = calculateHighScorePosition2(1500);
    displayHighScorePosition("Monika", calculation);
    calculation = calculateHighScorePosition2(900);
    displayHighScorePosition("Darek", calculation);
    calculation = calculateHighScorePosition2(400);
    displayHighScorePosition("Hania", calculation);
    calculation = calculateHighScorePosition2(50);
    displayHighScorePosition("Szymek", calculation);
  }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    } else if (score >= 100) {
      return 3;
    }
    return 4;
  }

  public static int calculateHighScorePosition2(int score) {

    int position = 4;
    if (score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    return position;
  }
}
