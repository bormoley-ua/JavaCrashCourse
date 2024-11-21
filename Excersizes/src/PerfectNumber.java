public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }

        int sum = 0;
        for (var i = number - 1; i>0 ; i--){
            if (number % i == 0){
                sum += i;
            }
        }

        return sum == number;
    }
}