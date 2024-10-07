public class Sum3And5Challenge {
    public static void main(String[] args) {
        int result = 0;
        int count = 0;
        for (int i = 1; i<1001; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Found match: " + i);
                result += i;
                count++;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Result: " + result);
    }
}
