import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(ReturnWordInNatoTranslation("CAR"));
    }


    public static String ReturnWordInNatoTranslation(String inputWord){
        var result = new ArrayList<String>();

        for (char ch: inputWord.toCharArray())
        {
            if (Objects.equals(ReturnWordForChar(ch), "Error!"))
            {
                return "Error! in char: " + ch;
            }

            result.add(ReturnWordForChar(ch));
        }


        return String.join(", ", result);
    }

//    public static String ReturnWordInNatoTranslation(String inputWord){
//        StringBuilder result = new StringBuilder();
//
//        for (char ch: inputWord.toCharArray())
//        {
//            if (Objects.equals(ReturnWordForChar(ch), "Error!"))
//            {
//                return "Error! in char: " + ch;
//            }
//
//            result.append(ReturnWordForChar(ch) + " ");
//        }
//        return result.toString();
//    }

    public static String ReturnWordForChar(char theChar){
        String result = "";

        switch (theChar)
        {
            case 'A' -> result = "Able";
            case 'B' -> result = "Baker";
            case 'C' -> result = "Charlie";
            case 'D' -> result = "Dog";
            case 'E' -> result = "Easy";

            case 'F' -> result = "Fox";
            case 'G' -> result = "George";
            case 'H' -> result = "How";
            case 'I' -> result = "Item";
            case 'J' -> result = "Jig";

            case 'K' -> result = "King";
            case 'L' -> result = "Love";
            case 'M' -> result = "Mike";
            case 'N' -> result = "Nan";
            case 'O' -> result = "Oboe";

            case 'P' -> result = "Peter";
            case 'Q' -> result = "Queen";
            case 'R' -> result = "Roger";
            case 'S' -> result = "Sugar";
            case 'T' -> result = "Tare";

            case 'U' -> result = "Uncle";
            case 'V' -> result = "Victor";
            case 'W' -> result = "William";
            case 'X' -> result = "X-ray";
            case 'Y' -> result = "Yoke";
            case 'Z' -> result = "Zebra";

            default -> result = "Error!";
        }

        return result;
    }
}