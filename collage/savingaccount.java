import java.util.*;
public class savingaccount
{
static float annualinterstrate;
float balance;
float monthlyinterest()
{
   balance+=(balance*annualinterstrate/144);
   return balance;
}
void getdata()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the balance");
    balance = sc.nextFloat();
}
public static void main(String... args)
{
    savingaccount s1 = new savingaccount();
    savingaccount s2 = new savingaccount();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter annual interest rate");
    annualinterstrate =sc.nextFloat();
    s1.getdata();
    s2.getdata();
    System.out.println(s1.monthlyinterest());
    System.out.println(s2.monthlyinterest());
}
} 
