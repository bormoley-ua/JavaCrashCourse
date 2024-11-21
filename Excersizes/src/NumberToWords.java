public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        var reverse = reverse(number);

        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        for (int i = reverse; i>0 ; i /= 10){
            System.out.println(digitToString(i % 10));
        }

        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number){
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int result = 0;

//        for (int i = 1; i <= number; i *= 10) {
//            result++;
//        }

        for (int i = number; i>0 ; i--){
            result++;
            i /= 10;
        }

        return result;
    }

    public static int reverse(int number){

//        int result = 0;
//        while (number != 0) {
//            // multiply by 10 then and add last digit (number % 10)
//            result = result * 10 + number % 10;
//            number /= 10; // discard last digit
//        }
//        return result;

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
            case 1 -> result = "One";
            case 2 -> result = "Two";
            case 3 -> result = "Three";
            case 4 -> result = "Four";
            case 5 -> result = "Five";
            case 6 -> result = "Six";
            case 7 -> result = "Seven";
            case 8 -> result = "Eight";
            case 9 -> result = "Nine";
            default -> result = "Zero";
        }

        return result + " ";
    }
}