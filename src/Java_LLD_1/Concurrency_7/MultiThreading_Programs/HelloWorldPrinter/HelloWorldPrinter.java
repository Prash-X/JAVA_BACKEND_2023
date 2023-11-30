package Java_LLD_1.Concurrency_7.MultiThreading_Programs.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable //1.Defining a task with runnable interface to create multithreaded program
{
    protected void doSomething()
    {
        System.out.println("Hello World from doSomething() from thread "+ Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello World from run() from thread: "+ Thread.currentThread().getName());
        doSomething();
    }
}
