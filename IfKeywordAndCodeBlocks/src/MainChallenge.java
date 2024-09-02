public class MainChallenge {
    private static boolean gameOver;
    private static int finalScore;
    private static int levelCompleted;
    private static int bonus;


    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
//        calculateScore();
        System.out.println("Your final score was " + calculateScoreReturned(gameOver, score, levelCompleted, bonus));

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
//        calculateScore();
        System.out.println("Your final score was " + calculateScoreReturned(gameOver, score, levelCompleted, bonus));
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreReturned(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void calculateScore() {
        var finalScore = MainChallenge.finalScore;
        var levelCompleted = MainChallenge.levelCompleted;
        var bonus = MainChallenge.bonus;
        var gameOver = MainChallenge.gameOver;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
