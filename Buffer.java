import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      // Create a new FileWriter object, passing the file name as a parameter
      FileWriter fileWriter = new FileWriter("MyFile.txt");

      // Wrap the FileWriter object in a BufferedWriter object
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      // Write the text to the file, each sentence on a new line
      bufferedWriter.write("This is the University Exam for OODP.");
      bufferedWriter.newLine();
      bufferedWriter.write("This a program to illustrate the use of files.");

      // Close the BufferedWriter and the underlying FileWriter
      bufferedWriter.close();
      fileWriter.close();

      System.out.println("Text written to file successfully!");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
  }
}
