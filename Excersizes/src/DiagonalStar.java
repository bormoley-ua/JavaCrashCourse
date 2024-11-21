public class DiagonalStar {
    public static void main(String[] args) {
        pintSquareStar(6);
    }
    // write code here
    public static void pintSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                if (j == 0 || j == number - 1 || i == 0 || i == number - 1 || i == j || i == number - j - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

                if (j == number - 1)
                    System.out.println();
            }
        }

    }
}