public class Final
{
    final int a;
    final int b;
    final static int c;
    {
        b=20;
    }
    Final()
    {
        a=10;
    }
    static
    {
        c=30;
    }
    public static void main(String[] args)
    {
        Final obj = new Final();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
    }
}
