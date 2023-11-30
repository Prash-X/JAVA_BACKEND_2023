package Java_LLD_1.Concurrency_7.Callables_Futures.MergeSort_MultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> //Using callable as we need our multiple threads need to return data to its parent thread.
{
    private List<Integer> arrayToSort;
    private ExecutorService es;
    public Sorter(List<Integer> arrayToSort, ExecutorService executorService)
    {
        this.arrayToSort = arrayToSort;
        this.es = executorService;
    }
    @Override
    public List<Integer> call() throws Exception
    {
        if(arrayToSort.size()<=1)
        {
            return arrayToSort;
        }
        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        for(int i=0;i<mid;i++)
        {
            leftArrayToSort.add(arrayToSort.get(i));
        }

        for(int i=mid;i<size;i++)
        {
            rightArrayToSort.add(arrayToSort.get(i));
        }

        Sorter leftArraySortingTask = new Sorter(leftArrayToSort,es);
        Sorter rightArraySortingTask = new Sorter(rightArrayToSort,es);

        Future<List<Integer>> sortedLeftArrayFuture = es.submit(leftArraySortingTask);
        Future<List<Integer>> sortedRightArrayFuture = es.submit(rightArraySortingTask);

        List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArray = sortedRightArrayFuture.get();

        int i=0;
        int j=0;

        List<Integer> sortedArray = new ArrayList<>();

        while(i<sortedLeftArray.size() && j<sortedRightArray.size())
        {
            if(sortedLeftArray.get(i)<=sortedRightArray.get(j))
            {
                sortedArray.add(sortedLeftArray.get(i));
                i++;
            }
            else {
                sortedArray.add(sortedRightArray.get(j));
                j++;
            }
        }
        while(i<sortedLeftArray.size())
        {
            sortedArray.add(sortedLeftArray.get(i));
            i++;
        }
        while(j<sortedRightArray.size())
        {
            sortedArray.add(sortedRightArray.get(j));
            j++;
        }
        return sortedArray;
    }
}
