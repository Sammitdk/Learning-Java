public class StringPrintByArguments
{
static String y[] = new String[10];
public static void main(String... args)
{
    for(int i=0;i<10;i++)
    {
        y[i]=args[i];
        System.out.println(y[i]);
    }
}
}
