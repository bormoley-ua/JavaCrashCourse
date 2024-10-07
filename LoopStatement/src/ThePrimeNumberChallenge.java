public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
//        System.out.println("0 is" + (isPrime(0) ? "" : " not") + " a prime number");
//        System.out.println("1 is" + (isPrime(1) ? "" : " not") + " a prime number");
//        System.out.println("2 is" + (isPrime(2) ? "" : " not") + " a prime number");
//        System.out.println("3 is" + (isPrime(3) ? "" : " not") + " a prime number");
//        System.out.println("8 is" + (isPrime(8) ? "" : " not") + " a prime number");
//        System.out.println("17 is" + (isPrime(17) ? "" : " not") + " a prime number");

        int primesCount = 0;
        int startingNumber = 200;
        int finalNumber = 1000;
        for (int i = startingNumber; i <= finalNumber && primesCount<3; i++){
            if (isPrime(i)){
                System.out.println(i +" is a prime number");
                primesCount++;
//                if (primesCount>2){
//                    break;
//                }
            }
        }

        System.out.println("Total prime numbers in the range of " + startingNumber + " and " + finalNumber + " found: " + primesCount);

    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber<2){
            return false;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}