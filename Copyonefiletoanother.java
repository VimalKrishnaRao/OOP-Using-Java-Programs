import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy 
{

    public static void main(String[] args) 
    {
        String srcFile = "src.txt";
        String destFile = "dest.txt";
        try (FileInputStream in = new FileInputStream(srcFile);
             FileOutputStream out = new FileOutputStream(destFile, true)) 
             {
                int b;
                while ((b = in.read()) != -1) 
                {
                    out.write(b);
                }
                System.out.println("File copied successfully.");
             } 
             catch (IOException e) 
             {
                System.out.println("An error occurred while copying the file.");
                e.printStackTrace();
             }
    }
}

//Here, the FileOutputStream is constructed with the true flag, which indicates that the data from the source file should be appended to the end of the destination file, rather than overwriting it.
