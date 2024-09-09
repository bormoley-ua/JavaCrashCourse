public class HeightChallenge {
    public static void main(String[] args) {
        double centimeters1 = convertTiCentimeters(68);
        System.out.println(centimeters1);

        System.out.println(convertTiCentimeters(5, 8));
    }

    public static double convertTiCentimeters(int heightInches){
        return heightInches*2.54;
    }

    public static double convertTiCentimeters(int heightFeet, int heightInchesRemaining){
        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + heightInchesRemaining;
        double result = convertTiCentimeters(totalInches);
        return result;
    }
}
