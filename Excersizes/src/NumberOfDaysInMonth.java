public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ( year < 1 || year > 9999 )
            return false;

        if (year % 400 == 0) {
            return true;
        } else return year % 4 == 0 && year % 100 != 0;
    }

    public static int getDaysInMonth(int month, int year){
        if ( month < 1 || month > 12 ){
            return -1;
        }

        if ( year < 1 || year > 9999 ){
            return -1;
        }

        return (switch (month){
            case 2 -> isLeapYear(year) ? 28 : 29;
            case 1, 3, 5, 7, 8 ,10, 12 -> 31;
            case 4, 6, 9, 11-> 30;
            default -> -1;
        });
    }
}