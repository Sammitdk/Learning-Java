public class hello
{
  
    hello()
    {
        System.out.println("This is an constructor");
        
    }
    static
    {
        System.out.println("static block");
        //System.exit(0);
      
    }
    {
       System.out.println("instance block");
      

    }
    public static void main(String... args)
    {
        
       hello obj = new hello();
       
        System.out.println("Helllo");
        //System.out.println(obj.a);
    }  
}
