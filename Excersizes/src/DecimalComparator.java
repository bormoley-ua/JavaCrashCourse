public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces1(double eter1, double eter2){
        return (long)eter1*1000 == (long)eter2*1000;
    }

    public static boolean areEqualByThreeDecimalPlaces(double eter1, double eter2){
        if (eter1 == 0 && eter2 == 0)
            return true;

        return Math.floor(Math.abs(eter1)*1000) % Math.floor(Math.abs(eter2)*1000) == 0 && eter1*eter2>0;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756,3.1757);
    }
}