public class SumOddRange {

    public static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end){

        if (!(start>0 && end>0 && start<=end)){
            return -1;
        }

        int result = 0;
        for (int number = start; number<=end; number++){
            if (isOdd(number)){
                result += number;
            }
        }
        return result;
    }
}