package package1;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(1);
        System.out.println(circle);
        System.out.println("Area is:" +circle.getArea());
        System.out.println("Perimeter is:" +circle.getPerimeter());

        circle = new Circle(2);
        System.out.println(circle);
        System.out.println("Area is:" +circle.getArea());
        System.out.println("Perimeter is:" +circle.getPerimeter());

        circle = new Circle(3.5, "black", false);
        System.out.println(circle);
        System.out.println("Area is:" +circle.getArea());
        System.out.println("Perimeter is:" +circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Area is:" +rectangle.getArea());
        System.out.println("Perimeter is:" +rectangle.getPerimeter());

        rectangle = new Rectangle(2.3, 4.5);
        System.out.println(rectangle);
        System.out.println("Area is:" +rectangle.getArea());
        System.out.println("Perimeter is:" +rectangle.getPerimeter());

        rectangle = new Rectangle(2.5, 1.3, "orange",true);
        System.out.println(rectangle);
        System.out.println("Area is:" +rectangle.getArea());
        System.out.println("Perimeter is:" +rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(2.5, "yellow", true);
        System.out.println(square);

    }
}
