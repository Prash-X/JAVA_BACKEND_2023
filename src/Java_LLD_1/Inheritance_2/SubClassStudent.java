//Child Class where it consists of attributes & methods of it own as well as from the parent-class

package Java_LLD_1.Inheritance_2;
public class SubClassStudent extends SubClassMentor
{
    String id = "Student";
    protected void display()
    {
        System.out.println("Student logged in :)");
        System.out.println("Student name: "+userName);
        System.out.println("Batch is: "+batchName);
        System.out.println("ID is: "+id);
    }
}
