public class NoonSnooze {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int x = a / 60;
        int y = a % 60;
        int h = 1200 + (100 * x);
        int n = h + y;
        int p = n / 100;
        String[] q = new String[2];
        q[0] = "a";
        q[1] = "p";

        int[] w = new int[12];
        w[0] = 12;
        w[1] = 1;
        w[2] = 2;
        w[3] = 3;
        w[4] = 4;
        w[5] = 5;
        w[6] = 6;
        w[7] = 7;
        w[8] = 8;
        w[9] = 9;
        w[10] = 10;
        w[11] = 11;

        String[] binary = new String[6];
        binary[1] = "";
        binary[0] = "0";
        binary[2] = "";
        binary[3] = "";
        binary[4] = "";
        binary[5] = "";


        System.out.println(
                w[p - (12 * (n / 1200))] + ":" + binary[y / 10] + y + q[(n / 1200) % 2] + "m");

    }
}
