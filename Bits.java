public class Bits {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if (a < 0) {
            System.out.println("Illegal input");
        }

        else {
            int num = 0;
            while (a >= 1) {
                a = a / 2;
                num = num + 1;
            }
            System.out.println(num);
        }
    }
}
