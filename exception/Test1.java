public class Test1
{
    public static void main(String[] args)
    {
        doStuff();
        System.out.println(10/0);
    }
    public static void doStuff()
    {
        domoreStuff();
        System.out.println("hello");
    }
    public static void domoreStuff()
    {
        System.out.println("hi");
    }
}
