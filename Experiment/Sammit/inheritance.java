 class parent1
{
    public void m()
    {
        System.out.println("Parent");
    }
}
class child1 extends parent1
{
public void m1() 
{
    System.out.println("child");
}
}
class Test1
{
    public static void main(String[] args)
    {
       child1 obj = new child1();
       obj.m();
       obj.m1();
    }
}

