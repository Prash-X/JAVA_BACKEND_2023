package Java_LLD_1.Inheritance_2;

public class Main
{
    public static void main(String[] args)
    {
        //SubClassMentor inherits the properties from the SuperClassUser
        SubClassMentor mentor = new SubClassMentor();
        mentor.userName = "Naman"; //username is inherited from the parent class
        mentor.joining_year = 2019;
        mentor.batchName = "Python October 2022 Morning";
        mentor.display();

        System.out.println();

        //SubClassStudent inherits the properties from the SuperClassUser as well as SubClassMentor also
        SubClassStudent student = new SubClassStudent();
        student.userName = "Prashant G";
        student.joining_year = 2022;
        student.batchName = "Java August 2022 Morning";
        student.display();
    }
}
