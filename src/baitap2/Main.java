package baitap2;

public class Main {
    public static void main(String[] args) {
        // Kiem thu point2D
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(4,8);
        System.out.println(point2D);

        // Kiem thu Point3D
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3,6,9);
        System.out.println(point3D);
    }
}
