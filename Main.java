package learningjava;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        // if (gameOver == true) is the same as if (gameOver)
        if (gameOver)  {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Challenge: print a second score on screen
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // make sure first prinout above displays as well
        //alternative answer below, but not as quick
//        boolean secondScore = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (secondScore) {
//            int newfinalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newfinalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver)  {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
