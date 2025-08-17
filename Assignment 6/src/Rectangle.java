public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length,double width){
      super("Rectangle");
        this.length=length;
        this.width=width;
    }
    //Area of rectangle = length * width
    //Perimeter of rectangle = 2* (length + width)
@Override
public double getArea(){
        return length * width;
}
@Override
    public double getPerimeter(){
        return 2 * (length + width);
}
}
