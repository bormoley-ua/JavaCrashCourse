public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;

        if ( hourOfDay > -1 && hourOfDay < 24 && ( hourOfDay < 8 || hourOfDay > 22 ))
            result = true;

        return result && barking;
    }
}