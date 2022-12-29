import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader 
{
    public static void main(String[] args) 
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println("You entered: " + line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading from the console.");
            e.printStackTrace();
        }
    }
}
