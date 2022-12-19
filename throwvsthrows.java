import java.io.*;
class Main 
{
    int area (int l, int b) throws Exception
    {
        if (l<0|| b<0)
            throw new Exception ("l and b cannot be negative");
        int a=l*b;
        return a;
    }
    void meth1() throws Exception
    {
        int a = area(-10,5);
        System.out.print(a);
    }
    public static void main (String args[]) 
    {
        try 
        {
            Main obj = new Main();
            obj.meth1();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage()); //e if you use toString()
        }
    }
}
