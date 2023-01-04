import java.io.Console;
public class Main
{
    public static void main (String args[])
    {
        Console console = System.console();
        System.out.println ("Enter Name: ");
        String name = console.readLine();
        System.out.println ("Name: "+name);
        System.out.println ("Enter Password: ");
        char[] ch = console.readPassword();
        String pass = String.valueOf(ch);
        System.out.println ("The Password is: "+pass);
    }
}
