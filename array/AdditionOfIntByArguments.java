public class AdditionOfIntByArguments
{
static int sum;
static int y[] = new int[2];
public static void main(String... args)
{
    for(int i=0;i<2;i++)
    {
        y[i]=Integer.parseInt(args[i]);
        sum = y[0]+y[1];
    }
    System.out.println(sum);
}
}