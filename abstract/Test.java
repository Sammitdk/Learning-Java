public class Test
{
    public static void main(String... args)
    {
        bus b = new bus();
        Auto a =new Auto();
        System.out.println("The no of wheels for bus is "+b.GetNoOFWheels());
        System.out.println("The no of wheels for Auto is "+a.GetNoOFWheels());
        
    }
}
 abstract class vehicle
{
    abstract public int GetNoOFWheels();
}
 class bus extends vehicle
{
    public int GetNoOFWheels()
    {
        return 7;
    }
}
 class Auto extends vehicle
{
    public int GetNoOFWheels()
    {
        return 3;
    }
}
