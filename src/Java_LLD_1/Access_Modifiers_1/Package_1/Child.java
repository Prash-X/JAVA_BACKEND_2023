package Java_LLD_1.Access_Modifiers_1.Package_1;

public class Child extends Student   //Creating child subclass from student parent class
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "Rahul"; //Protected member can be accessed in child class of the same package
        s.display_name(); //Output: Rahul

        Child c = new Child();
        c.name = "Ram"; //Protected member can be accessed in child class of the same package
        c.display_name(); //Output: Ram
    }

}
