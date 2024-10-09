public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++){
            System.out.println(i);
        }

        int y = 1;
        while (y <= 5){
            System.out.println(y);
            y++;
        }

        while (true){
            if (y > 5){
                break;
            }
            System.out.println(y);
            y++;
        }

        y = 1;
        boolean isReady = false;
        do {
            System.out.println(y);
            y++;
            isReady = (!(y > 5));
        }
        while (isReady);

        int num = 0;
        while (num < 50) {
            num += 5;
            if (num % 25 == 0){
                continue;
            }
            System.out.print(num + "_");
        }
    }
}
