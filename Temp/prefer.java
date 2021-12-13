public class prefer
{
    public static void main(String... args)
    {
        bus b = new bus();
        Auto a =new Auto();
        System.out.println("The no of wheels for bus is "+b.GetNoOFWheels());
        //System.out.println("The no of wheels for bus is "+b.GetNoOFWheels(7));
        System.out.println("The no of wheels for Auto is "+a.GetNoOFWheels(3));
    }
}
 class bus 
{
    public int GetNoOFWheels()
    {
        return 7;
    }
    public int GetNoOFWheels(int x)
    {
        return x;
    }
}
 class Auto extends bus
{
    public int GetNoOFWheels()
    {
        return 3;
    }
}
