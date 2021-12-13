public class interf
{ 
    public static void main(String[] args)
    {
        
    }  
}
interface vehicle
{
    int maxPassenger=4;
    int maxSpeed=100;
}
interface Landvehicle extends vehicle
{
    int numWheels=4;
    void drive();
}
interface seaVehicle extends vehicle
{
    int displacement=1800;
    void launch();
}
class car implements Landvehicle
{
    public int numWheels=4;
    public void drive()
    {
        System.out.println("Drive on ground");
    }
    public void SpeedLimit()
    {
        System.out.println("80");

    }

}
class HoverCraft implements Landvehicle,seaVehicle
{
    public int numWheels=4;
    public void drive()
    {
        System.out.println("Drive on sea or land");
    }
    public void launch()
    {
        System.out.println("Launched");
    }
    public void enterLand()
    {
        System.out.println("Driving on land");
    }
    public void enterSea()
    {
        System.out.println("Driving on sea");
    }  
}
class ship implements seaVehicle
{
    public void launch()
    {
        System.out.println("Launched"); 
    }   
    public void sea()
    {
        System.out.println("You are in ocence");
    }

}





