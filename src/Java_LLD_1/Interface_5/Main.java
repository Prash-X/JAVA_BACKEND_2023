package Java_LLD_1.Interface_5;

import Java_LLD_1.Contructor_Chaining_3.C;

public class Main
{
    public static void main(String[] args)
    {
        Shape r = new Rectangle(3,4);
        System.out.println("Area of Rectangle: "+r.getArea());
        System.out.println("Perimeter of Rectangle: "+r.getPerimeter());

        Shape c = new Circle(2);
        System.out.println("\nArea of circle: "+c.getArea());
        System.out.println("Perimeter of circle: "+c.getPerimeter());

    }

}
