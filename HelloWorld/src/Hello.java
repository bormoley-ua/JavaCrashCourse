public class Hello {
    public static void main(String[] args)
    {
        System.out.println("Hello, Leonid");
         boolean isAlien = false;
         if (!isAlien) {
             System.out.println("It is not an alien!");
             System.out.println("And I am scared of aliens");
         }

         int topScore = 80;
         if (topScore <= 100)
         {
             System.out.println("You got the high score!");
         }

         int secondTopScore = 95;
         if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Grater than second top score and less than 100");
         }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is not an error");

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic)
            System.out.println("This is a domestic car");

        String s = (isDomestic) ? "This is a domestic Car" : "This car is not domestic";
        System.out.println(s);

        double myD1 = 20.00d;
        double myD2 = 80.00d;
        double mySum1 = (myD1 + myD2) * 100.00d;
        System.out.println(mySum1);
        double myRemainder = mySum1 % 40d;
        System.out.println(myRemainder);
        boolean isNoReminder = myRemainder == 0.00d;
        System.out.println(isNoReminder);
        if (!isNoReminder)
        {
            System.out.println("got some reminder");
        }

        boolean isReminder =  (((myD1 + myD2) * 100.00) % 40) != 0.00;
        System.out.println(isReminder);
        if (isReminder)
        {
            System.out.println("got some reminder");
        }



    }
}
