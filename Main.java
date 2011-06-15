package sleepsort;

import java.util.concurrent.*;

/**
 *
 * @author flipvanrijn
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 7, 2, 1, 1, 3, 4};

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i : numbers)
            executor.execute(new Number(i));

        executor.shutdown();
    }
    
}
