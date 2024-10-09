public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        if (number<0)
            return -1;

        if (number < 10)
            return number;

        int sum = 0, x = number;
        while (x % 10 != 0){
            sum += x % 10;
            x = x / 10;
        }

//        while (number > 9) {
//            sum += (x % 10);
//            number /= 10;
//        }
//        sum += number;

        return sum;
    }
}
