interface Bank
{
    float rateOfInterest();
}
class SBI implements Bank
{
    public float rateOfInterest()
    {
        return 9.15f;
    }
}
class PNB implements Bank
{
    public float rateOfInterest()
    {
        return 9.02f;
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Bank a = new SBI();
        Bank b = new PNB();
        System.out.println(" ROI "+a.rateOfInterest());
        System.out.println(" ROI "+b.rateOfInterest());
    }
}