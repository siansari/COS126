public class RollDice {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < 10; j++) {
                double b = (Math.random() * 6) + 1;
                counter = counter + (int) b;
            }
            a[i] = counter;
        }

        for (int k = 10; k <= 60; k++) {
            int r = 0;
            int m = 0;
            for (int t = 0; t < n; t++) {
                if (a[t] == k) {
                    if (m != 0) System.out.print('*');
                    else
                        System.out.print(k + ":" + '*');
                    r++;
                    m++;
                }
            }
            if (r == 0) System.out.print(k + ":");
            System.out.println();
        }
    }
}

