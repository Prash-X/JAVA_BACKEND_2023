package Java_LLD_1.Concurrency_7.Callables_Futures.MergeSort_MultiThreaded;


import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main
{
    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort = List.of(5,4,3,2,1,0);

        ExecutorService es = Executors.newCachedThreadPool(); //creating thread pools using cachedThreadPools method as we cannot fix the thread size

        Sorter sorter = new Sorter(arrayToSort, es); //creating object of Sorter class and passing parameters

        Future<List<Integer>> sortedArrayFuture = es.submit(sorter); //Future is used to hold the sortedArray once it is sorted and ready to serve in further code

        List<Integer> sortedArray = sortedArrayFuture.get(); //with help of get() we fetch the sorted array from the future class used above line and store it in list sortedArray here.

        for(Integer in: sortedArray)
        {
            System.out.println(in); //Printing sorted Array
        }
    }
}
