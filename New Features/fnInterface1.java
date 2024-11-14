import java.util.*;
@FunctionalInterface
interface A
{
    void f1();
    default void f2()
    {
        System.out.println("Default Method Inside Interface");
    }
}
class B implements A
{
    public void f1()
    {
        System.out.println("Abstract Method Inside Class");
    }
}
public class fnInterface1
{
    public static void main(String[] args) {
        B a=new B();
        a.f2();
        a.f2();
    }
}