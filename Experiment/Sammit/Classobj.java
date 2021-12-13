class Student
{
    String name;
    int rollno;
    void Details(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    void Display()
    {
        System.out.println("Name is "+name+"  "+"Roll no is "+rollno);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        a.Details("Sumit",1);
        b.Details("Sammit",11);
        c.Details("Niranjan",30);
        a.Display();
        b.Display();
        c.Display();
    }         
}