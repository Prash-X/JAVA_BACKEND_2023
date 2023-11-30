/*Constructor Chaining: While inheritance who will initialize properties of parent.
* 1. The child knows how to initialize, we can create custom constructor in child
*
* 2. Child do not know how to initialize the parent constructor
*
* -----> In java when constructor of child is called it automatically calls constructor of parent class, this process is called "Constructor Chaining!"
*
* In this package from main class we call the child class D & the execution is like:  D(Last child class) is called first, but A(parent class) finishes first*/

package Java_LLD_1.Contructor_Chaining_3;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Demo of Constructor Chaining:");
        E e = new E("Dog");
    }
}
