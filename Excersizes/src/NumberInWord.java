public class NumberInWord {
    // write code here
    public static void printNumberInWord(int number){
        System.out.println(
                switch (number)
                {
                    case 0 -> "Zero";
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    default -> "Other";
                });
    }
}