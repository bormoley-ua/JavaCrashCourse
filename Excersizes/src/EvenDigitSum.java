public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

     public static int getEvenDigitSum(int number){
        if (number<0)
            return -1;

        int sum = 0;
        int currentDigit = 0;

        // for (int i = number; i > 0; i /= 10) {
        //     int lastDigit = i % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        // }

        while (number != 0)
        {
            currentDigit = number % 10;
            if (currentDigit % 2 == 0)
                sum += currentDigit;
            number /=  10;
        }

        return sum;
    }
}