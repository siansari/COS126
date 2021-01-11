/* *****************************************************************************
 *  Name:    Sara Ansari
 *
 *  Description:  a program Prices.java that reads, prints, and plots stock
 * prices.
 **************************************************************************** */

public class Prices {
    public static void main(String[] args) {
        int n = StdIn.readInt();

        String[] date = new String[n];
        double[] open = new double[n];
        double[] high = new double[n];
        double[] low = new double[n];
        double[] close = new double[n];

        for (int i = 0; i < n; i++) {
            date[i] = StdIn.readString();
            open[i] = StdIn.readDouble();
            high[i] = StdIn.readDouble();
            low[i] = StdIn.readDouble();
            close[i] = StdIn.readDouble();
        }

        StockPlot.plot(open, high, low, close);

        StdOut.printf("%d\n", n);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%s %.2f %.2f %.2f %.2f",
                          date[i], open[i], high[i], low[i], close[i]);
            StdOut.println();
        }

    }
}
