package baitap3;

public class Main {
    public static void main(String[] args) {
        // Kiem thu Point
        System.out.println("-------------POINT---------------");
        Point point = new Point();
        System.out.println(point);
        point = new Point(5,6);
        System.out.println(point);

        // Kiem thu MovablePoint
        System.out.println("------------MOVABLEPOINT---------------");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(55,79);
        System.out.println(movablePoint);
    }
}
