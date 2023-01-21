import java.io.*;

public class FileStatistics 
{
    public static void main(String args[]) throws IOException 
    {
        File f = new File("path/to/file.txt");
        int characters = 0;
        int lines = 0;
        int words = 0;

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line = br.readLine()) != null) 
        {
            lines++;
            characters += line.length();
            words += line.split(" ").length;
        }
        br.close();

        System.out.println("Characters: " + characters);
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
    }
}
