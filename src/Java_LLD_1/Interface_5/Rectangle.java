package Java_LLD_1.Interface_5;

public class Rectangle implements Shape //implements keyword is used for using interface
{
    private double length;
    private double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double getArea()
    {
        return length*width;

    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);

    }
}
