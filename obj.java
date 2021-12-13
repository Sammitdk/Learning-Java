interface interf
{
    void get();
}
public class obj
{
    public static void main(String... args)
    {
        interf s = new interf()
        {
         public void get()
         {
             System.out.println("Sammit khade");
         }
        };
        s.get();
    }
}
