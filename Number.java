package sleepsort;

/**
 *
 * @author flipvanrijn
 */
public class Number implements Runnable
{

    private int number;

    public Number(int number)
    {
        this.number = number;
    }

    public void run()
    {
        try
        {
            Thread.sleep(number*500);
            System.out.println(number);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
