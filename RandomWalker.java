public class RandomWalker {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        System.out.println("(" + x + ", " + y + ")");

        int i = 0;

        while (i < a) {

            double r = Math.random();

            if (r < 0.25) {
                x = x + 1;
            }

            else if (r < 0.5) {
                x = x - 1;
            }

            else if (r <= 0.75) {
                y = y + 1;
            }

            else if (r < 1) {
                y = y - 1;
            }

            System.out.println("(" + x + ", " + y + ")");
            i++;
        }

        int d = (x * x) + (y * y);
        System.out.println("squared distance = " + d);

    }
}
