package Java_LLD_1.Concurrency_7.MultiThreading_Programs.HelloWorldPrinter;

public class Main
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("Sum= "+sum+"From Thread: "+ Thread.currentThread().getName());

        HelloWorldPrinter h = new HelloWorldPrinter(); //creating an object of task
        h.doSomething();

        Thread t1 = new Thread(h); //passing the task to a new Thread
        t1.start(); //Start the thread
        System.out.println("Hello World from thread: "+ Thread.currentThread().getName());
    }
}
/*  3 steps to create a multithreaded program: While defining tasks always think in terms of what tasks needed to be performed in parallel rather thinking what threads to create !!
*       1.Define Tasks
*       2.Assign task to a thread
*       3.Start() thread */