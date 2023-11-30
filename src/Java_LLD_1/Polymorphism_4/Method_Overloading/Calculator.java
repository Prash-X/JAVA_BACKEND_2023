package Java_LLD_1.Polymorphism_4.Method_Overloading;

public class Calculator //Compile-time Polymorphism
{
    public int add(int x, int y)
    {
        return x+y;
    }
    public double add(double x, double y)
    {
        return x+y;
    }
    public int add(int x, int y, int z)
    {
        return x+y+z;
    }
}
