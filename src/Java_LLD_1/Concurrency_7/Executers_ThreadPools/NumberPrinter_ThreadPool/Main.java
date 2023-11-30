package Java_LLD_1.Concurrency_7.Executers_ThreadPools.NumberPrinter_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService e = Executors.newFixedThreadPool(10); //Syntax for creating ThreadPool of fixed size

        for(int i=1;i<1000;i++)
        {
            NumberPrinter np = new NumberPrinter(i); //creating object of defined task
            e.execute(np); //this line creates threadpool containing 10 different threads and executing them in parallel without much load
        }
    }
}
