public class ForLoop {
    public static void main(String[] args) {
//        for (int counter = 1; counter <= 5; counter++) {
//            System.out.println("Loop " + counter);
//        }

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000, 2));

//        for (double counter = 2.0; counter <= 5.0; counter++) {
//            System.out.println("10,000 at " + counter + " % interest = " + calculateInterest(10_000.0, counter));
//        }

        for (double counter = 7.5; counter <= 10.0; counter+=0.25) {
            System.out.println("100 at " + counter + " % interest = " + calculateInterest(100.0, counter));
            if (counter > 8.5){
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * interestRate / 100);
    }
}