public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        number = reverse(number);

        for (int i = number; i>0 ; i /= 10){
            System.out.println(digitToString(i % 10));
        }

    }

    public static int getDigitCount(int number){
        int result = 0;
        for (int i = number; i>0 ; i--){
            result++;
            i /= 10;
        }

        return result;
    }

    public static int reverse(int number){
        String result = "";
        for (int i = number; i>0 ; i /= 10){
            result += Integer.toString(i % 10);
        }

        return Integer.parseInt(result);
    }

    public static String digitToString(int digit){
        String result = "";
        switch (digit)
        {
            case 1 -> result = "one";
            case 2 -> result = "two";
            case 3 -> result = "three";
            case 4 -> result = "four";
            case 5 -> result = "five";
            case 6 -> result = "six";
            case 7 -> result = "seven";
            case 8 -> result = "eight";
            case 9 -> result = "nine";
            default -> result = "zero";
        }

        return result + " ";
    }
}