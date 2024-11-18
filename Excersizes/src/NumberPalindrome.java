public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1321));
    }

//    public static boolean isPalindrome(int number){
//
//        String numString = String.valueOf(number);
//        int len = numString.length();
//
//        for (var i = 0; i < len/2; i++)
//        {
//            System.out.println(i);
//            System.out.println(numString.charAt(i) + " and " + numString.charAt(len-i-1));
//            if (numString.charAt(i-1) != numString.charAt(len-i-1));{
//                return false;
//            }
//        }
//
//        return true;
//
//    }

    public static boolean isPalindrome1(int number) {
        int reverse = 0;
        int original = number;
        while (original != 0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }

        return reverse == number;
    }

        public static boolean isPalindrome(int number){

            String numString = Integer.toString(Math.abs(number));
            int len = numString.length();
            String reverse = "";
            for (int i = len - 1; i >= 0 ; i--) {
                reverse += Character.toString(numString.charAt(i));
            }

            return reverse.compareTo(numString) == 0;
        }
}
