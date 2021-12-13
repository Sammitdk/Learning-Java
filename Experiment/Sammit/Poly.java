class P
{
public void method()
{
println("No args method");
}
public void method(int a)
{
println("int args method");
}
}
class C extends P
{
public void method(int a)
{
println("int args method with argument "+a);
}
}
class Poly
{
public static void main(String[] args)
{
P objC = new P();
objC.method();
objC.method(10);
C objR = new C();
objR.method(20);
}
}