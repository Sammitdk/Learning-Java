public class p 
{
    public void property()
    {
        System.out.println("Land Gold Cash");
    }
    public void marry()
    {
        System.out.println("SubhLaxmi");
    }
}
class c extends p
{
    public void marry()
    {
        System.out.println("Mizo");
    }
}
class overriding
{
    public static void main(String[] args) 
    {
        p a = new p();
        c b = new c();
        p e = new c();
        a.marry();
        b.marry();
        e.marry();
    }
}
