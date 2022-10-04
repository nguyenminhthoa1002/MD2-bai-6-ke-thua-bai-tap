package baiTap1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double capacity() {
        return this.height*getArea();
    }

    public String toString() {
        return "A cylinder has the height = " +
                getHeight() +", capacity = " +
                capacity();
    }
}
