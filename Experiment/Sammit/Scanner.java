import java.util.Scanner;
class TestScanner
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) 
    {
   
        System.out.println("Enter name,age and salary");
        String name =s.nextLine();
        int age =s.nextInt();
        double salary =s.nextDouble();
        System.out.println("Name:   "+ name);
        System.out.println("Age :   "+ age);
        System.out.println("Salary: "+ salary);
    }
}
