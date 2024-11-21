public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(3,0,15));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount*5+smallCount<goal)
            return false;

        int sum = 0;
        for (int b = 1; b <= bigCount; b++)
        {
            if (goal == b*5){
                return true;
            } else if (goal > b*5){
                sum = b*5;
            }
            else {
                break;
            }
        }

        for (int s = 1; s <= smallCount; s++)
        {
            if (goal == sum + s){
                return true;
            }
            else if (goal > sum + s){
                continue;
            }
            else {
                break;
            }
        }

        return false;
    }
}