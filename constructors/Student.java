public class Student
{
    String name;
    int rollno;
    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
}
class Age extends Student
{
    String name;
    int rollno;
    int age;
    Age(String name,int rollno,int age)
    {
        super(name,rollno);
        this.age=age;
        this.Display();
    }
    void Display()
    {
        System.out.println(super.name +" "+ super.rollno+" "+this.age);
    }
    public static void main(String[] args)
    {
        Age a = new Age("Sammit",11,20);
        Age b= new Age("Sumit",1,20);
        Age c= new Age("Niranjan",30,20);
    }
}