class parent
{
    public void property()
    {
        System.out.println("Cash,Gold,Land");
    }
    public void marry()
    {
         System.out.println("Laxmi");
    }
}
class child extends parent
{
    public void marry()
    {
        System.out.println("Alia"); 
    }
   public static void main(String[] args) 
   {
    child obj = new child();
    obj.marry();
   }
}