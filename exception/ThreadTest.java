public class ThreadTest
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        t.start();
        try
        {
        t.start();
        }
        catch(IllegalThreadStateException e)
        {
            System.out.println("Already started");
        }
      
    }
    
}
