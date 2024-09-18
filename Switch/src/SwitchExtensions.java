public class SwitchExtensions {
    public static void main(String[] args) {
        int value = 2;

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was a: " + value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
//            default -> "bad";
            default -> {
                String badRespose = month + " is bad";
                yield badRespose;
            }
        };

//        switch(month){
//            case "JANUARY":
//            case "FEBRUARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//        }
//        return "bad";
    }
}
