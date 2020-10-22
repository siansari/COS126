public class Transform2D {
    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = alpha * x[i];
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = alpha * y[i];
        }
    }

    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = dx + x[i];
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = dy + y[i];
        }
    }


    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array) {
        double[] c = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            c[i] = array[i];
        }
        return c;
    }

    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta) {
        double[] c1 = copy(x);
        double[] c2 = copy(y);
        for (int i = 0; i < y.length; i++) {
            x[i] = c1[i] * Math.cos(Math.toRadians(theta)) - (c2[i] * Math
                    .sin(Math.toRadians(theta)));
            y[i] = c2[i] * Math.cos(Math.toRadians(theta)) + (c1[i] * Math
                    .sin(Math.toRadians(theta)));
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args) {
        // Set the x- and y-scale
        StdDraw.setScale(0, 7.0);

        // Original polygon
        double[] x = { 1, 3, 3, 1 };
        double[] y = { 1, 1, 3, 2 };

        // Copy of original polygon and scaling
        double[] a = copy(x);
        double[] b = copy(y);
        scale(a, b, 1.2);


        // Rotate, translate and draw the copy
        rotate(a, b, -45.0);
        translate(a, b, 1.0, 2.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(a, b);

        // Draw the original polygon
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
    }
}

