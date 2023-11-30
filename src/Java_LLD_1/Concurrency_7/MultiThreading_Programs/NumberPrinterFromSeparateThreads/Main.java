package Java_LLD_1.Concurrency_7.MultiThreading_Programs.NumberPrinterFromSeparateThreads;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            NumberPrinter np = new NumberPrinter(i); //2.Creating an object of task
            Thread t = new Thread(np); //3.passing the task to a new Thread
            t.start(); //4.Start the thread
        }
    }
}
