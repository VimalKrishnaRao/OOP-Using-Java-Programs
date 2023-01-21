import java.io.*;

public class CaseConverter 
{
    public static void main(String args[]) throws IOException 
    {
        File f = new File("example.txt");
        BufferedReader read = new BufferedReader(new FileReader(f));
        String line;
        while ((line = read.readLine()) != null) 
        {
            for (char c : line.toCharArray()) 
            {
                if (Character.isUpperCase(c)) 
                {
                    System.out.print(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) 
                {
                    System.out.print(Character.toUpperCase(c));
                } 
                else 
                {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        reader.close();
    }
}

//for (char c : line.toCharArray()) is a for-each loop in Java. It is used to iterate over the elements of an array or a collection.

//In this specific example, the line.toCharArray() method is called to convert the current line read from the file into an array of characters. This array of characters is then used as the collection over which the for-each loop iterates.

//For each iteration of the loop, the current character in the array (c) is assigned to the variable c. The loop then performs the operations inside the curly braces for each character in the array. In this case, it checks if the current character is an uppercase letter or a lowercase letter and performs case conversion accordingly, then prints the converted character.
