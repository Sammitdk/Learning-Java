class CountObj
{
    static int count;
    {
        count++;
    }
CountObj()
{
    
}
public static void main(String[] args)
{
    CountObj a = new CountObj(); 
    CountObj b = new CountObj(); 
    CountObj c = new CountObj(); 
    CountObj d = new CountObj(); 
    System.out.println(count);
}
}