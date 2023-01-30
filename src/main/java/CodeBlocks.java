
public class CodeBlocks {

  public static void main(String[] args) {
//    boolean gameOver = true;
//    int score = 800;
//    int levelCompleted = 5;
//    int bonus = 100;

    calculateScore(true,800,5,100);

//    if (gameOver) {
//      int finalScore = score + (levelCompleted * bonus);
//      System.out.println("Final score is : " + finalScore);
//    }

//    score = 10000;
//    levelCompleted = 8;
//    bonus = 200;
//    int finalScore = score + (levelCompleted * bonus);
//    System.out.println(" Second final score is :" + finalScore);
    calculateScore(true,10000,8,200);
  }

  public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Final score from a method is: " + finalScore);
    }

  }
}
