package package1;

public class Circle extends Shape {
    public static final double PI = 3.14;
    double radius = 1;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled ){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public double getPerimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" //mot vong tron co ban kinh la
                + getRadius()
                + ", which is a subclass of " // do la 1 lop con cua
                + super.toString();
    }
}