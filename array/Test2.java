public class Test2
{
static int y[] = new int[10];
public static void main(String... args)
{
    for(int i=0;i<10;i++)
    {
        y[i]=Integer.parseInt(args[i]);
        System.out.println(y[i]);
    }
}
}