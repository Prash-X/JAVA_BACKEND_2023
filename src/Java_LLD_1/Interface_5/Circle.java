package Java_LLD_1.Interface_5;

public class Circle implements Shape //implements keyword is used for using interface
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getPerimeter()
    {
        //System.out.println(2*Math.PI * radius * radius);
        return 2*Math.PI * radius * radius;
    }
    @Override
    public double getArea() {
        //System.out.println(Math.PI*radius*radius);
        return Math.PI*radius*radius;
    }
}
