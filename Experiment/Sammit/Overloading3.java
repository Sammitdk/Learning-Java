class Test
{
    Test()
    {
        System.out.println("No-arg constructor");
    }
    Test(int i)
    {
        System.out.println("int-constructor");
    }
    Test(double d)
    {
        System.out.println("double-constructor");
    }
    public static void main(String[] args) 
    {
        Test a = new Test();
        Test b = new Test(10);
        Test c = new Test(10.10);
    }
}
