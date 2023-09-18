package Java_LLD_1.Access_Modifiers_1.Package_1;

public class Student
{
    protected String name;
    public String UniversityName;

    private String CollegeAddress = "Hubli, Karnataka";

    protected double percentage;

    int batch_year = 2021; //default access-modfier;

    public Student(String name, String UniversityName, double percentage)
    {
        this.name = name;
        this.UniversityName = UniversityName;
        this.percentage = percentage;
    }
    public void display_batch()
    {
        System.out.println("Batch: "+ batch_year);
    }
    public void display_address()
    {
        System.out.println("College Address: "+ CollegeAddress);
    }

    public void display_name()
    {
        System.out.println("Name: "+name);
    }

    public void display_university()
    {
        System.out.println("University Name: "+UniversityName);
    }
    public void display_percentage()
    {
        System.out.println("Percentage: "+percentage);
    }

}
