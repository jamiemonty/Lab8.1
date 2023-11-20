package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterAppend {
    public static void main(String[] args) {

        String fileName = "file12.txt";

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName, true)))
        {
            writer.println("This line will be appended");

        }
        } catch (IOException e){
            System.out.println("An error occured while writing to the file.");
            e.printStackTrace();
        }
    }
}
