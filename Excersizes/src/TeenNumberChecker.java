public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int param1, int param2, int param3){

        return isTeen(param1) || isTeen(param2) || isTeen(param3);
    }

    public static boolean isTeen(int param1){

        return param1>=13 && param1<=19;
    }

    public static boolean hasTeen1(int param1, int param2, int param3){
        if (param1>=13 && param1<=19)
            return true;
        if (param2>=13 && param2<=19)
            return true;
        if (param3>=13 && param3<=19)
            return true;

        return false;
    }

    public static boolean isTeen1(int param1){
        if (param1>=13 && param1<=19)
            return true;

        return false;
    }
}