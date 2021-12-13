public class IntByArgs
{
static int[] y = new int[50];
public static void main(String... args)
{
    for(int i=0;i<args.length;i++)
    {
        y[i]=Integer.parseInt(args[i]);
        System.out.println(y[i]);
    }
}
}