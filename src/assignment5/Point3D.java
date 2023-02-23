package src.assignment5;


//Question 1 Part2
public class Point3D extends Point2D {
    protected double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static void main(String[] args) {
        Point2D p2d = new Point2D(3, 4);
        double dist2d = p2d.distanceFromOrigin();
        System.out.println(dist2d);

        Point3D p3d = new Point3D(1, 2, 3);
        double dist3d = p3d.distanceFromOrigin();
        System.out.println(dist3d);

    }
}
