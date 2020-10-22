public class Art {

    // recursively draws circles
    public static void drawCircle(double x, double y, double radius) {
        StdDraw.circle(x, y, radius);
        if (radius > 2) {
            drawCircle(x + radius / 2, y, radius / 2);
            drawCircle(x - radius / 2, y, radius / 2);
            drawCircle(x, y + radius / 2, radius / 2);
            drawCircle(x, y - radius / 2, radius / 2);
        }

    }

    // Takes user input for the radius and recursively draws circles
    public static void main(String[] args) {
        StdDraw.setXscale(-50, 50);
        StdDraw.setYscale(-50, 50);
        double radius = Double.parseDouble(args[0]);
        drawCircle(0, 0, radius);
    }
}
