public class overloading 
{
    public void m1(int i)
    {
        System.out.println("int arg");
    }
    public void m1(float i)
    {
        System.out.println("float arg");
    }
    public void m1(short i)
    {
        System.out.println("short arg");
    }
}
class run
{
    public static void main(String... args)
    {
    overloading o = new overloading();
    o.m1(10);
    o.m1('a');
    o.m1(10.10F);
    o.m1(11l);
    //o.m1(10);
    }

}
