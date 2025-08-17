
public class ShapeCalculatorDemo {
        public static void main(String[] args) {
            Circle circle = new Circle(10);
            Rectangle rectangle = new Rectangle(15, 20);

            //Array

            Shape[] shapes = {circle, rectangle};
            for (Shape shape : shapes) {
                System.out.println("Shape: " + shape.getName());
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());


            }
        }
}
