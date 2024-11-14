import java.util.*;
class Hell
{
    int r;
    Hell()
    {
        r=10;
    }
    void Display()
    {
        System.out.println("In Founction "+r);
    }
    public static void main(String args[])
    {
        Hell sc=new Hell();
        System.out.println("Hello Class");
        sc.Display();
    }
}