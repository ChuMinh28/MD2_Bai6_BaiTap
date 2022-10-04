package baitap;

public class Main {
    public static void main(String[] args) {
        // Kiem thu Circle
        System.out.println("--------------CIRCLE-----------------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.6,"green");
        System.out.println(circle);

        // Kiem thu Cylinder
        System.out.println("------------CYLINDER------------");
        Cylinder cylinder = new Cylinder(1,"red",5);
        System.out.println(cylinder);
    }
}
