package baitap4;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(7,8,9);
        System.out.println(triangle);
        triangle = new Triangle("yellow",false,7,8,9);
        System.out.println(triangle);
    }
}
