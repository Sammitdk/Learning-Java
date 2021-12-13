public class loop
{
    public static void main(String... args)
    {
        int i,s;
        for( s=0;s<=10;s++)
        {
        for( i=0;i<=10;i++)
        {
            if(i==s)
            break;
            System.out.println(i+"  "+s);
        }
    }
    }
    
}
