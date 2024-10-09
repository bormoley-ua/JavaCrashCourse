public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(minutes + " min = " + (int)minutes/525600 + " y and " + (int)(minutes%525600)/1440 + " d");
    }
}