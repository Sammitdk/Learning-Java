
class Test extends main
{
    void print()
    {
    System.out.println("hello");
    }
    int a=10;
    
}
class sammit extends Test
{
    void print()
    {
        System.out.println("hello 2");
    }
   
}
class sam extends sammit
{
    void print()
    {
        System.out.println("hello 3");
        System.out.println(a);
        
    }

}
public class main
{
public static void main(String... args) 
{
    Test obj = new sam();

    obj.print();
}
}