public class SwitchExpressionChallange {
    public static void main(String[] args) {
        printDayOfWeek(4);
        printDayOfWeek(4, "en");
    }

    public static void printDayOfWeek(int day) {
        System.out.println(switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        });
    }

    public static void printDayOfWeek(int day, String language) {
        String result = "Invalid Day";

        if (day == 0) {
            result = "Sunday";
        } else if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        }

        System.out.println(result);
    }
}

