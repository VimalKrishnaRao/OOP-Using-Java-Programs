import java.io.*;
import java.util.Scanner;
class MyException extends Exception
{
    MyException (String message)
    {
        super (message);
    }
}
class Operation 
{
    float divide (int a, int b) throws MyException
    {
        float c = (float)a/(float)b;
        if (c<0.01)
            throw new MyException ("Numerator is too small");
        return c;
    }
}
class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter 2 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try 
        {
            Operation obj = new Operation();
            float ans = obj.divide(a, b);
            System.out.println ("Answer: "+ans);
        } 
        catch(MyException e) 
        {
            System.out.println ("Caught MyException");
            System.out.println (e.getMessage());
        }
        finally
        {
            System.out.println ("I'm Always Here");
        }
    }
}
