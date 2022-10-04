package baitap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double getV(){
       return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with radius = "
                +getRadius()
                +" and height: "
                +getHeight()
                +" has volume: "
                +getV()
                +" and "
                +getColor();
    }
}
