class singleton 
{
    static int count;
    {
        count++;
    }
    static private singleton s = new singleton();
    private singleton()
    {
        super();
    }
    public static singleton Getsingleton()
    {
        return s;
    }
}
class TestSingleton
{
    public static void main(String[] args)
    {
        singleton s1 = singleton.Getsingleton();
        singleton s2 = singleton.Getsingleton();
        singleton s3 = singleton.Getsingleton();
        singleton s4 = singleton.Getsingleton();
        //singleton s= new singleton();
        System.out.print(singleton.count+" Object craeted");
    }
}
