public class foreach {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int result = 0;
        for (int num : numbers)
        {
            if ( num % 2 ==0)
                result += num;
            else result -= num;
        }
        System.out.println(result);
    }
}
