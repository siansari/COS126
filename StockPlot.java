/******************************************************************************
 *  Description:  Provides simple plotting functions for stock prices
 (coded by COS126 Faculty at Princeton).
 ******************************************************************************/

public class StockPlot {
    // draws x and y axes from xmin to xmax, ymin to ymax
    private static void setupAxes(double xmin, double xmax,
                                  double ymin, double ymax) {

        // Set the scale
        double xSize = Math.abs(xmax - xmin);
        double ySize = Math.abs(ymax - ymin);

        double SCALE = 0.05;
        double x0 = xmin - xSize * SCALE;
        double x1 = xmax + xSize * SCALE;
        double y0 = ymin - ySize * SCALE;
        double y1 = ymax + ySize * SCALE;

        // Create a coordinate system
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        // Draw 10 ticks per axis
        int TICKS = 10;
        double LEN = 0.025;
        StdDraw.setPenColor(StdDraw.GRAY);
        for (int i = 0; i <= TICKS; i++) {
            double x = i * (xSize / TICKS) + xmin;
            StdDraw.line(x, ymin - (ySize * LEN), x, ymin);
            double y = i * (ySize / TICKS) + ymin;
            StdDraw.line(xmin - (xSize * LEN), y, xmin, y);
        }

        // Draw x and y axis
        StdDraw.line(xmin, ymin, xmax, ymin);
        StdDraw.line(xmin, ymin, xmin, ymax);
    }

    // plot various prices on StdDraw
    public static void plot(double[] open, double[] high,
                            double[] low, double[] close) {

        int n = open.length;

        // Find min low and max high
        double maxHigh = high[0];
        double minLow = low[0];
        for (int i = 0; i < n; i++) {
            if (low[i] < minLow) minLow = low[i];
            if (high[i] > maxHigh) maxHigh = high[i];
        }

        // Setup Plot
        setupAxes(0.0, (double) n, minLow, maxHigh);

        // Candlestick Plot
        for (int i = 0; i < n; i++) {
            double x = (double) i + 1.0;
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(x, high[i], x, low[i]);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(x, open[i], x, close[i]);
        }
    }

    // Plot moving average
    public static void plot(double[] open, double[] high,
                            double[] low, double[] close,
                            double[] ma, int days) {
        // Plot prices first
        plot(open, high, low, close);

        // Plot moving average
        int n = open.length;
        StdDraw.setPenColor(StdDraw.BLUE);
        for (int i = days; i < n; i++) {
            StdDraw.line(i, ma[i - 1], i + 1, ma[i]);
        }
    }

    // test client
    public static void main(String[] args) {
        double[] open = { 35.00, 35.18, 34.80, 34.80 };
        double[] high = { 35.45, 35.45, 34.80, 34.80 };
        double[] low = { 34.71, 34.75, 33.92, 33.90 };
        double[] close = { 35.36, 34.77, 34.40, 34.34 };
        plot(open, high, low, close);
        double[] ma = { 0.0, 0.0, 34.84, 34.50 };
        plot(open, high, low, close, ma, 3);
    }

}
