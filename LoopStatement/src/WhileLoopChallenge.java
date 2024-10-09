public class WhileLoopChallenge {
    public static void main(String[] args) {
        int     count = 0,
                countAll = 0,
                i = 5;
//        int i = 4;
        while (i <= 20){
            countAll++;
            if (isEvenNumber(i)){
                count++;
                System.out.println(i);
                if (count == 5){
                    break;
                }
            }
            i++;

//            i++;
//            if (!isEvenNumber(i)){
//                continue;
//            }
//            System.out.println(i);
        }

        System.out.println("Count of event numbers: " + count);
        System.out.println("Total numbers checked: " + countAll);
    }

    public static boolean isEvenNumber(int number){
        return number > 0 && number % 2 == 0;
    }
}
