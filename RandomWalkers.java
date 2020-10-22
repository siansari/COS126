public class RandomWalkers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int j = 0;
        double sum = 0;

        while (j < b) {

            int x = 0;
            int y = 0;
            int i = 0;

            while (i < a) {

                double r = Math.random();

                if (r < 0.25) {
                    x = x + 1;
                }

                else if (r < 0.5) {
                    x = x - 1;
                }

                else if (r < 0.75) {
                    y = y + 1;
                }

                else if (r < 1) {
                    y = y - 1;
                }

                i++;
            }

            sum = sum + (x * x) + (y * y);

            j++;
        }

        System.out.println("mean squared distance = " + sum / b);

    }
}
