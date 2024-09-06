public class LeapYear {
    // write code here
    public static boolean isLeapYear(int year){
        if ( year < 1 || year > 9999 )
            return false;

        boolean result = false;

        if ( year % 4 == 0 ){
            if ( year % 100 == 0 ) {
                if ( year % 400 == 0 ){
                    result = true;
                }
            } else {
                result = true;
            }
        }
        return result;
    }
}