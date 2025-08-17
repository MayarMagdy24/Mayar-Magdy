public class Circle extends Shape {
    private double radius;
    //constructor
    public Circle(double radius){
        super("Circle");
        this.radius=radius;

    }
    //overriding
    //Area of circle = length * width = pi * r*r
    //Perimeter of circle = 2*(length + width )=2* pi *r
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


}
