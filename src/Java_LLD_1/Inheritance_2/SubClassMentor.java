//Child Class where it consists of attributes & methods of it own as well as from the parent-class

package Java_LLD_1.Inheritance_2;
public class SubClassMentor extends SuperClassUser
{
    String batchName;
    String id = "Mentor";
    protected void display()
    {
        System.out.println("Mentor logged in!!");
        System.out.println("Mentor name: "+userName);
        System.out.println("Batch is: "+batchName);
        System.out.println("ID is: "+id);
    }
}
