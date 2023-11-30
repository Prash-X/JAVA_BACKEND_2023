package Java_LLD_1.Polymorphism_4.Method_Overloading;

public class Main
{
    public static void main(String[] args)
    {
        Calculator c  = new Calculator();
        int result1 = c.add(1,2);
        double result2 = c.add(1.5,2.6);
        int result3 = c.add(1,2,4);

        //Method Overloading: Compiler can know at compile time which method to call based on arguments
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
