public class Main {
    public static void main(String[] args) {
        String name = "Leonid";
        displayHighScorePosition(name, calculateHighScorePosition(1500));
        displayHighScorePosition(name, calculateHighScorePosition(1000));
        displayHighScorePosition(name, calculateHighScorePosition(500));
        displayHighScorePosition(name, calculateHighScorePosition(100));
        displayHighScorePosition(name, calculateHighScorePosition(25));
//        displayHighScorePosition(name, calculateHighScorePosition(1500));
//        displayHighScorePosition(name, calculateHighScorePosition(999));
//        displayHighScorePosition(name, calculateHighScorePosition(499));
//        displayHighScorePosition(name, calculateHighScorePosition(99));
//        displayHighScorePosition(name, calculateHighScorePosition(-1000));
    }

    public static void displayHighScorePosition(String playersName, int scorePosition){
        System.out.println(playersName + " managed to get into position " + scorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int PlayersScore){
        int result = 4;
        if (PlayersScore>=1000){
            result = 1;
        } else if (PlayersScore>=500){
            result = 2;
        } else if (PlayersScore>=100){
            result = 3;
        }

        return result;
    }
}
