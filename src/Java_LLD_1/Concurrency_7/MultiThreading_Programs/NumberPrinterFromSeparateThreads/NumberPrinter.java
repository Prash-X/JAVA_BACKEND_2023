package Java_LLD_1.Concurrency_7.MultiThreading_Programs.NumberPrinterFromSeparateThreads;

public class NumberPrinter implements Runnable //1.Defining a task with runnable interface to create multithreaded program
{
    private int numberToPrint;

    protected NumberPrinter(int numberToPrint)
    {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run()
    {
        System.out.println(numberToPrint + " Printed by: "+ Thread.currentThread().getName());
    }
}
