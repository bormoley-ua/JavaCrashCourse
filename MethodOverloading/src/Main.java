public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Leonid", 500);
        System.out.println("New score is " + newScore);

        System.out.println("New score is " + calculateScore(75));

        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        return calculateScore("Anonymus", score);
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
    }

//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static void calculateScore(){
        System.out.println("No player name, no player score");
    }

    public static int calculateScores(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
}
