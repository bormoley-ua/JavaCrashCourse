public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("9 ,9 " + hasSharedDigit(9,9));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (!(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99))
            return false;

        for (int i = num1; i > 0; i /= 10){
            int digit1 = i % 10;
            for (int j = num2; j > 0; j /= 10)
            {
                if (digit1 == j % 10)
                    return true;
            }
        }
        return false;
    }
}
