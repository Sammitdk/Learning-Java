import java.util.*;
public class Employee 
{
    String name,last;
    float salary;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        name = sc.nextLine();
        System.out.println("Enter the Last name");
        last = sc.nextLine();
        System.out.println("Enter your salary");
        salary = sc.nextFloat();
    }
    void put()
    {
        System.out.print("Your name is "+name);
        System.out.println(" "+last);
        System.out.println("And your salary is"+salary);
        System.out.println("Your incremented 10% salalry is "+(salary+(salary/10)));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        obj.get();
        obj.put();
    }
}
