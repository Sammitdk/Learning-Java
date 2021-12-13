import java.util.Scanner;
class TooOldException extends RuntimeException
{
    TooOldException(String s)
    {
        super(s);
    }
}
class TooYoungException extends RuntimeException
{
    TooYoungException(String s)
    {
        super(s);
    }
}
public class MyException 
{
    static int age;
     public static void main(String[] args)
     {
         System.out.println("Enter your Age");
         Scanner s = new Scanner(System.in);
         age = s.nextInt();
         if(age<20)
         {
             throw new TooYoungException("To Young TO Maryy");
         }
         else if(age>60)
         {
            throw new TooOldException("To Old TO Maryy");
         }
         else
         {
             System.out.println("We will contact you by a email for match");
         } 
     }
}

