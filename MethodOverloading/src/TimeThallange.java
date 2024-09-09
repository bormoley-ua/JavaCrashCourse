public class TimeThallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(45, -65));
        System.out.println(getDurationString(145, 65));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(45, 65));
    }

    public static String getDurationString(int seconds)
    {
        if (seconds<0)
            return "Error, negative amount of seconds given: " + seconds;

//        int hours = seconds / 3600;
//        int minutes = (seconds - hours * 3600) / 60;
//        int remainingSeconds = seconds - hours * 3600 - minutes * 60;
//        return hours + "h " + minutes + "m " + remainingSeconds + "s";

        int minutes1 = seconds / 60;
//        int remainingMinutes = minutes1 % 60;
//        int hours1 = minutes1 / 60;
        int remainingSeconds = seconds % 60;
//        return hours1 + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        return getDurationString(remainingSeconds, minutes1);
    }

    public static String getDurationString(int seconds, int minutes)
    {
        if ( minutes<0 ) {
            return "Error, negative amount of minutes given: " + minutes;
        }
        if (seconds<0 || seconds>59) {
            return "Error, seconds given out of 0-59 range: " + seconds;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
//        int totalSeconds = minutes*60 + seconds;
//        return getDurationString(totalSeconds);
    }
}
